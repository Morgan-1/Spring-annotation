package annotation.condition;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector
{


    public String[] selectImports(AnnotationMetadata importingClassMetadata)
    {


        return new String[]{"annotation.bean.Yellow","annotation.bean.Blue"};

    }
}
