class MethodsCaller {
    public static void main(String[] args) {
        MethodsClass myObject = new MethodsClass();

        Class<?> clazz = myObject.getClass();

        for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
            RepeatCount annotation = method.getAnnotation(RepeatCount.class);
            if (annotation != null) {
                int repeat = annotation.repeat();
                for (int i = 0; i < repeat; i++) {
                    try {
                        method.setAccessible(true);
                        if (method.getParameterCount() == 0) {
                            method.invoke(myObject);
                        } else {
                            Object[] parameters = new Object[method.getParameterCount()];
                            for (int j = 0; j < method.getParameterCount(); j++) {
                                Class<?> parameterType = method.getParameterTypes()[j];
                                if (parameterType == int.class) {
                                    parameters[j] = 1;
                                } else if (parameterType == String.class) {
                                    parameters[j] = "Hello, World!";
                                } else if (parameterType == double.class) {
                                    parameters[j] = 2.67;
                                }
                            }
                            method.invoke(myObject, parameters);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
