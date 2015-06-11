#parse("File Header.java")
#if (${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
public class ${NAME}{
    private final static String TAG = "${PROJECT_NAME}:${NAME}";
    
    private static ${NAME} ourInstance = new ${NAME}();

    public static ${NAME} getInstance() {
        return ourInstance;
    }

    private ${NAME}() {
    }
}
