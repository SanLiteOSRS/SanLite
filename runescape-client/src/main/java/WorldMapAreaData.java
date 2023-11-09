import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kv")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("al")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("an")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("ar")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cu")
	@ObfuscatedSignature(
		descriptor = "(Ltm;Ltm;IZI)V",
		garbageValue = "1963374909"
	)
	@Export("init")
	void init(Buffer var1, Buffer var2, int var3, boolean var4) {
		this.read(var1, var3); // L: 17
		int var5 = var2.readUnsignedShort(); // L: 18
		this.worldMapData0Set = new HashSet(var5); // L: 19

		int var6;
		for (var6 = 0; var6 < var5; ++var6) { // L: 20
			WorldMapData_0 var7 = new WorldMapData_0(); // L: 21

			try {
				var7.init(var2); // L: 23
			} catch (IllegalStateException var12) { // L: 25
				continue; // L: 26
			}

			this.worldMapData0Set.add(var7); // L: 28
		}

		var6 = var2.readUnsignedShort(); // L: 30
		this.worldMapData1Set = new HashSet(var6); // L: 31

		for (int var10 = 0; var10 < var6; ++var10) { // L: 32
			WorldMapData_1 var8 = new WorldMapData_1(); // L: 33

			try {
				var8.init(var2); // L: 35
			} catch (IllegalStateException var11) { // L: 37
				continue; // L: 38
			}

			this.worldMapData1Set.add(var8); // L: 40
		}

		this.initIconsList(var2, var4); // L: 42
	} // L: 43

	@ObfuscatedName("ch")
	@ObfuscatedSignature(
		descriptor = "(Ltm;ZB)V",
		garbageValue = "-123"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method9198(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "2073842388"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!class219.client.method1246() && !class219.client.isOtlTokenRequesterInitialized() && !class219.client.method1428()) { // L: 1098
			Login.Login_response1 = ""; // L: 1102
			Login.Login_response2 = "Enter your username/email & password."; // L: 1103
			Login.Login_response3 = ""; // L: 1104
			PcmPlayer.method838(2); // L: 1105
			if (var0) {
				Login.Login_password = ""; // L: 1106
			}

			if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1108
				if (class449.clientPreferences.method2466() != null) { // L: 1109
					Login.Login_username = class449.clientPreferences.method2466(); // L: 1110
					Client.Login_isUsernameRemembered = true; // L: 1111
				} else {
					Client.Login_isUsernameRemembered = false; // L: 1113
				}
			}

			ObjectComposition.method3936(); // L: 1115
		} else {
			PcmPlayer.method838(10); // L: 1099
		}
	} // L: 1100 1116

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "54"
	)
	static void method5584(boolean var0) {
		byte var1 = 0; // L: 1119
		boolean var2 = class449.clientPreferences.method2468() >= Client.field531; // L: 1122
		if (!var2) { // L: 1124
			var1 = 12; // L: 1125
		} else if (class219.client.method1246() || class219.client.isOtlTokenRequesterInitialized() || class219.client.method1428()) { // L: 1127
			var1 = 10; // L: 1128
		}

		PcmPlayer.method838(var1); // L: 1130
		if (var0) { // L: 1131
			Login.Login_username = ""; // L: 1132
			Login.Login_password = ""; // L: 1133
			class503.field5039 = 0; // L: 1134
			class369.otp = ""; // L: 1135
		}

		if (Login.Login_username == null || Login.Login_username.length() <= 0) { // L: 1138
			if (class449.clientPreferences.method2466() != null) { // L: 1139
				Login.Login_username = class449.clientPreferences.method2466(); // L: 1140
				Client.Login_isUsernameRemembered = true; // L: 1141
			} else {
				Client.Login_isUsernameRemembered = false; // L: 1143
			}
		}

		if (Client.Login_isUsernameRemembered && Login.Login_username != null && Login.Login_username.length() > 0) { // L: 1146
			Login.currentLoginField = 1; // L: 1147
		} else {
			Login.currentLoginField = 0; // L: 1150
		}

	} // L: 1153
}
