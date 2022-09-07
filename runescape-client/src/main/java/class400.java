import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("oz")
public class class400 implements class399 {
	@ObfuscatedName("w")
	JSONObject field4439;

	public class400(byte[] var1) throws UnsupportedEncodingException {
		this.method7047(var1);
	} // L: 18

	public class400(String var1) throws UnsupportedEncodingException {
		this.method7050(var1); // L: 13
	} // L: 14

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)[B",
		garbageValue = "57"
	)
	public byte[] vmethod7057() throws UnsupportedEncodingException {
		return this.field4439 == null ? new byte[0] : this.field4439.toString().getBytes("UTF-8"); // L: 50 51
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "([BI)V",
		garbageValue = "1703144575"
	)
	void method7047(byte[] var1) throws UnsupportedEncodingException {
		String var2 = new String(var1, "UTF-8");
		this.method7050(var2);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-1297162396"
	)
	void method7050(String var1) throws UnsupportedEncodingException {
		try {
			if (var1.charAt(0) == '{') {
				this.field4439 = new JSONObject(var1);
			} else {
				if (var1.charAt(0) != '[') { // L: 30
					throw new UnsupportedEncodingException("Invalid JSON passed to the JSON content builder."); // L: 36
				}

				JSONArray var2 = new JSONArray(var1);
				this.field4439 = new JSONObject();
				this.field4439.put("arrayValues", var2); // L: 33
			}

		} catch (JSONException var3) {
			throw new UnsupportedEncodingException(var3.getMessage());
		}
	} // L: 42

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)Lorg/json/JSONObject;",
		garbageValue = "-108"
	)
	public JSONObject method7049() {
		return this.field4439; // L: 45
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1656748026"
	)
	public static final boolean method7055(char var0) {
		if (Character.isISOControl(var0)) { // L: 16
			return false;
		} else if (class113.isAlphaNumeric(var0)) { // L: 17
			return true;
		} else {
			char[] var1 = class424.field4621; // L: 19

			int var2;
			char var3;
			for (var2 = 0; var2 < var1.length; ++var2) { // L: 20
				var3 = var1[var2]; // L: 21
				if (var0 == var3) { // L: 22
					return true;
				}
			}

			var1 = class424.field4619;

			for (var2 = 0; var2 < var1.length; ++var2) { // L: 27
				var3 = var1[var2]; // L: 28
				if (var0 == var3) {
					return true;
				}
			}

			return false; // L: 32
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZZI)V",
		garbageValue = "348489361"
	)
	@Export("openURL")
	public static void openURL(String var0, boolean var1, boolean var2) {
		if (var1) { // L: 23
			if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Action.BROWSE)) { // L: 24
				try {
					Desktop.getDesktop().browse(new URI(var0)); // L: 26
					return; // L: 53
				} catch (Exception var4) { // L: 29
				}
			}

			if (class29.field167.startsWith("win")) { // L: 31
				FriendLoginUpdate.method6597(var0, 0, "openjs"); // L: 34
			} else if (class29.field167.startsWith("mac")) { // L: 39
				FriendLoginUpdate.method6597(var0, 1, "openjs"); // L: 40
			} else {
				FriendLoginUpdate.method6597(var0, 2, "openjs"); // L: 44
			}
		} else {
			FriendLoginUpdate.method6597(var0, 3, "openjs"); // L: 49
		}

	}
}
