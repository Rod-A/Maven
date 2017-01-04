package com.mycompany.mvn_deleteMe_quickStart;

/**
 * Hello world!
 *
 */
public class App 
{

		public static final String  NAME = "kiris";
		public static final Integer AGE = 22;
		
		private String  name;
		private Integer age;
		
		public App() {
			this(App.NAME, App.AGE);
		}
		
		public App(String _name, Integer _age) {
			name = _name;
			age = _age;
		}
		
		public Integer add2age(Integer _add2age) {
			return age + _add2age;
		}

		public Integer add2age(String _add2age) throws CannotParse2IntegerException {
//			return age + Integer.parseInt(_add2age);
			
			Integer add2age = 0;
			try {
				add2age = Integer.parseInt(_add2age);
			} catch (NumberFormatException nfe) {
				throw new CannotParse2IntegerException(_add2age);
			} finally {
				// TODO: handle finally clause
			}
			return add2age(add2age);
//			return age + add2age;
		}

		public String prefixedName(String _prefix2name) {
			return _prefix2name + name;
		}
		
		public String getName() {
			return name;
		}

		public Integer getAge() {
			return age;
		}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
