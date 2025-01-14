package Testing.Payloads;

public class PojoSimpleBody {

  public static PojoBodyData GetBodyData()
  {
      PojoBodyData data = new PojoBodyData();
      data.setFirstName("John");
      data.setLastName("Doe");
      data.setAge("30");
      data.setEmail("johndoe@example.com");
      return data;
  }


}
