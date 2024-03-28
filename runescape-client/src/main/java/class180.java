import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONObject;

@ObfuscatedName("gp")
public class class180 {
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lgp;"
	)
	static final class180 field1917;
	@ObfuscatedName("az")
	String field1909;
	@ObfuscatedName("ah")
	String field1913;
	@ObfuscatedName("af")
	String field1916;
	@ObfuscatedName("at")
	String field1906;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		longValue = -3940949976830180749L
	)
	long field1907;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Lar;"
	)
	class14 field1903;
	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "Lap;"
	)
	class18 field1904;
	@ObfuscatedName("aw")
	final int field1910;
	@ObfuscatedName("ad")
	final int field1911;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = 1465554931
	)
	int field1912;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -264638889
	)
	int field1915;
	@ObfuscatedName("aj")
	String field1905;
	@ObfuscatedName("ay")
	boolean field1918;

	static {
		field1917 = new class180(); // L: 30
	}

	class180() {
		this.field1909 = "";
		this.field1913 = "";
		this.field1916 = ""; // L: 16
		this.field1906 = ""; // L: 17
		this.field1907 = -1L; // L: 18
		this.field1910 = 1; // L: 21
		this.field1911 = 2; // L: 22
		this.field1912 = 1; // L: 23
		this.field1915 = 0; // L: 28
	} // L: 33

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)V",
		garbageValue = "-361176905"
	)
	public void method3576(int var1, String var2) {
		this.field1915 = var1;
		this.field1905 = var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1741686828"
	)
	public void method3589(boolean var1) {
		this.field1918 = var1;
		this.field1903 = new class14("crmsession", 1, 1);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
		garbageValue = "1424753165"
	)
	void method3582(String var1, String var2, String var3) {
		if (this.field1912 != 2) {
			this.field1909 = var1;
			this.field1913 = var2;
			this.field1916 = var3; // L: 53
			if (!this.field1909.endsWith("/")) {
				this.field1909 = this.field1909 + "/";
			}

			if (!this.field1913.equals("")) {
				String var4 = this.field1909;
				var4 = var4 + "session/open/" + this.field1913;
				if (this.field1916.equals("")) {
				}

				var4 = var4 + "?userHash=" + this.field1916;

				try {
					this.field1904 = this.method3558(var4); // L: 65
					this.field1907 = VerticalAlignment.method3924();
				} catch (IOException var6) {
					this.field1904 = null;
					this.field1913 = "";
					this.field1916 = "";
				}

			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "166164695"
	)
	public void method3565() {
		if (this.field1904 == null) {
			if (!this.field1906.isEmpty() && this.field1912 == 1) {
				long var1 = VerticalAlignment.method3924();
				long var3 = var1 - this.field1907; // L: 81
				String var5 = this.field1909;
				var5 = var5 + "session/close/" + this.field1913 + "/" + this.field1906;
				if (this.field1916.isEmpty()) {
					var5 = var5 + "?sessionDuration=" + var3;
				} else {
					var5 = var5 + "?userHash=" + this.field1916 + "&sessionDuration=" + var3;
				}

				try {
					this.field1904 = this.method3558(var5);
				} catch (IOException var7) {
					this.field1912 = 1;
				}
			}

		}
	} // L: 77 97

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1829839864"
	)
	public void method3561() {
		if (this.field1903 != null) { // L: 100
			this.field1903.method181();
		}

	} // L: 101

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "882581124"
	)
	void method3562() {
		if (!this.field1906.isEmpty()) { // L: 104
			String var1 = ""; // L: 105
			switch(this.field1915) { // L: 106
			case 1:
				var1 = "events/click"; // L: 111
				break; // L: 112
			case 2:
				var1 = "events/dismissed"; // L: 108
				break; // L: 109
			case 3:
				var1 = "events/impression"; // L: 114
			}

			if (!this.field1905.isEmpty()) { // L: 119
				String var2 = this.field1909; // L: 122
				var2 = var2 + var1 + "/" + this.field1913 + "/" + this.field1906 + "/" + this.field1905 + "?userHash=" + this.field1916; // L: 123

				try {
					this.field1904 = this.method3558(var2); // L: 125
				} catch (IOException var4) { // L: 127
					this.field1912 = 1; // L: 128
				}

				this.field1912 = 1; // L: 130
				this.field1915 = 0; // L: 131
			}
		}
	} // L: 120 132

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1052922865"
	)
	public void method3563() {
		if (this.field1904 != null && this.field1904.method258()) { // L: 135
			if (this.field1904.method258() && this.field1904.method259().method272() == 200 && this.field1906.isEmpty()) { // L: 138 139 140
				String var1 = this.field1904.method259().method274(); // L: 141
				if (var1.isEmpty()) { // L: 142
					return; // L: 143
				}

				this.field1906 = var1; // L: 145
			}

			if (this.field1915 != 0) { // L: 150
				this.method3562(); // L: 151
			}

		}
	} // L: 136 153

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "974054455"
	)
	public boolean method3564(String var1) {
		this.method3576(2, var1); // L: 156
		return true; // L: 157
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Lap;",
		garbageValue = "-1721427473"
	)
	class18 method3558(String var1) throws IOException {
		URL var2 = new URL(var1); // L: 161
		class10 var3 = new class10(var2, class9.field30, this.field1918); // L: 162

		try {
			JSONObject var4 = new JSONObject(); // L: 164
			var3.method87(new class482(var4)); // L: 165
		} catch (Exception var5) { // L: 167
		}

		return this.field1903.method174(var3); // L: 168
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V",
		garbageValue = "-1500192028"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = ""; // L: 34
				if (var1 != null) { // L: 35
					Throwable var4 = var1; // L: 37
					String var5;
					if (var1 instanceof RunException) { // L: 40
						RunException var6 = (RunException)var1; // L: 41
						var5 = var6.message + " | "; // L: 42
						var4 = var6.throwable; // L: 43
					} else {
						var5 = ""; // L: 45
					}

					StringWriter var18 = new StringWriter(); // L: 46
					PrintWriter var7 = new PrintWriter(var18); // L: 47
					var4.printStackTrace(var7); // L: 48
					var7.close(); // L: 49
					String var8 = var18.toString(); // L: 50
					BufferedReader var9 = new BufferedReader(new StringReader(var8)); // L: 51
					String var10 = var9.readLine(); // L: 52

					label63:
					while (true) {
						while (true) {
							String var11 = var9.readLine(); // L: 54
							if (var11 == null) { // L: 55
								var5 = var5 + "| " + var10; // L: 73
								var2 = var5; // L: 76
								break label63;
							}

							int var12 = var11.indexOf(40); // L: 56
							int var13 = var11.indexOf(41, var12 + 1); // L: 57
							if (var12 >= 0 && var13 >= 0) { // L: 58
								String var14 = var11.substring(var12 + 1, var13); // L: 59
								int var15 = var14.indexOf(".java:"); // L: 60
								if (var15 >= 0) { // L: 61
									var14 = var14.substring(0, var15) + var14.substring(var15 + 5); // L: 62
									var5 = var5 + var14 + ' '; // L: 63
									continue; // L: 64
								}

								var11 = var11.substring(0, var12); // L: 66
							}

							var11 = var11.trim(); // L: 68
							var11 = var11.substring(var11.lastIndexOf(32) + 1); // L: 69
							var11 = var11.substring(var11.lastIndexOf(9) + 1); // L: 70
							var5 = var5 + var11 + ' '; // L: 71
						}
					}
				}

				if (var0 != null) { // L: 78
					if (var1 != null) { // L: 79
						var2 = var2 + " | ";
					}

					var2 = var2 + var0; // L: 80
				}

				System.out.println("Error: " + var2); // L: 82
				var2 = var2.replace(':', '.'); // L: 83
				var2 = var2.replace('@', '_'); // L: 84
				var2 = var2.replace('&', '_'); // L: 85
				var2 = var2.replace('#', '_'); // L: 86
				if (RunException.RunException_applet == null) { // L: 87
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?cv=" + RunException.RunException_revision + "&cs=" + class73.field911 + "&u=" + RunException.field5389 + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + WorldMapDecoration.field3118 + "&e=" + var2); // L: 88
				DataInputStream var17 = new DataInputStream(var3.openStream()); // L: 89
				var17.read(); // L: 90
				var17.close(); // L: 91
			} catch (Exception var16) { // L: 93
			}

		}
	} // L: 94

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-122"
	)
	public static void method3593() {
		class216.field2207.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ic")
	@ObfuscatedSignature(
		descriptor = "(IIB)V",
		garbageValue = "0"
	)
	static final void method3594(int var0, int var1) {
		if (var0 < 128) { // L: 4105
			var0 = 128; // L: 4106
		} else if (var0 > 383) { // L: 4108
			var0 = 383; // L: 4109
		}

		if (UserComparator10.cameraPitch < var0) { // L: 4111
			UserComparator10.cameraPitch = (var0 - UserComparator10.cameraPitch) * CollisionMap.field2445 / 1000 + UserComparator10.cameraPitch + class440.field4745; // L: 4112
			if (UserComparator10.cameraPitch > var0) { // L: 4113
				UserComparator10.cameraPitch = var0; // L: 4114
			}
		} else if (UserComparator10.cameraPitch > var0) { // L: 4117
			UserComparator10.cameraPitch -= (UserComparator10.cameraPitch - var0) * CollisionMap.field2445 / 1000 + class440.field4745; // L: 4118
			if (UserComparator10.cameraPitch < var0) { // L: 4119
				UserComparator10.cameraPitch = var0; // L: 4120
			}
		}

		var1 &= 2047; // L: 4123
		int var2 = var1 - class17.cameraYaw; // L: 4124
		if (var2 > 1024) { // L: 4125
			var2 -= 2048; // L: 4126
		} else if (var2 < -1024) { // L: 4128
			var2 += 2048; // L: 4129
		}

		if (var2 > 0) { // L: 4131
			class17.cameraYaw = var2 * CollisionMap.field2445 / 1000 + class17.cameraYaw + class440.field4745; // L: 4132
			class17.cameraYaw &= 2047; // L: 4133
		} else if (var2 < 0) { // L: 4135
			class17.cameraYaw -= class440.field4745 + -var2 * CollisionMap.field2445 / 1000; // L: 4136
			class17.cameraYaw &= 2047; // L: 4137
		}

		int var3 = var1 - class17.cameraYaw; // L: 4139
		if (var3 > 1024) { // L: 4140
			var3 -= 2048; // L: 4141
		} else if (var3 < -1024) { // L: 4143
			var3 += 2048; // L: 4144
		}

		if (var3 < 0 && var2 > 0 || var3 > 0 && var2 < 0) { // L: 4146
			class17.cameraYaw = var1; // L: 4147
		}

	} // L: 4149
}
