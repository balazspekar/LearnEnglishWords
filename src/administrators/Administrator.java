package administrators;

import java.util.HashMap;

public class Administrator
{
	private HashMap<String, String> admins = new HashMap<String, String>();

	public Administrator()
	{
		admins.put("peba", "1111");
		admins.put("admin", "2222");
	}

	public HashMap<String, String> getAdmins()
	{
		return admins;
	}
}
