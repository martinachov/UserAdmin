package ar.com.project.helper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="mappingHelper")
@Scope("singleton")
public class MappingHelper {

	private Mapper mapper;

	public MappingHelper(){
		mapper = new DozerBeanMapper();
	}
	
	public <T> T map(Object sourceObject, Class<T> destinationClass){
		return mapper.map(sourceObject, destinationClass);
	}
	
	public <T> List<T> map(Collection<? extends Object> sourceListObject, Class<T> destinationClass){
		List<T> listResult = new ArrayList<T>();
		for (Object o : sourceListObject) {
			listResult.add(mapper.map(o, destinationClass));
		}
		return listResult;
	}
}

