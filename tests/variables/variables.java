public class Variables {

  public static int STATIC_VARIABLE = 123;
  private static final Logger LOGGER = LoggerFactory.getLogger(ComplexFilterTest.class);

  int packageVariable = 234;
  private int privateVariable = 345;

  private Integer nullVariable = null;
  private Integer createVariable = new Integer();

  private List<String> genericVariable1 = new ArrayList<String>();
  private Bean<String> genericVariable2 = new Bean<String>("abc");
  private Bean<String> genericVariable2 = new Bean<String>("abc", "def", "ghi", "jkl");
  private Map<Integer, String> genericVariable4 = new HashMap<Integer, String>();
  private Map<Integer, String, Integer, String> genericVariable5 = new HashMap<Integer, String, Integer>();

  private Object[] arrayVariable1 = new Object[3];
  private Object[][] arrayVariable2 = new Object[3][3];
  private Object[] arrayVariable3 = new Object[] { "abc", "def", "ghi" };
  private Object[] arrayVariable4 = new Object[] { "abc", "def", "ghi", "jkl", "mno" };
  private Object[] arrayVariable5 = { "abc", "def", "ghi" };
  
  private Interface anonymousClassVariable = new Interface(){
    @Override
    void doSomething() {
      System.out.println("do something");
    }
  };

  public void variableMethod(final int finalVariable) {
    int localVariable = 456;
    int castVariable = (int) (4 / 2);
  }

}
