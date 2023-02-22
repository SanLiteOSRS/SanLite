import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("je")
@Implements("WorldMapAreaData")
public class WorldMapAreaData extends WorldMapArea {
	@ObfuscatedName("is")
	@ObfuscatedSignature(
		descriptor = "Lhn;"
	)
	@Export("scene")
	static Scene scene;
	@ObfuscatedName("b")
	@Export("worldMapData0Set")
	HashSet worldMapData0Set;
	@ObfuscatedName("m")
	@Export("worldMapData1Set")
	HashSet worldMapData1Set;
	@ObfuscatedName("t")
	@Export("iconList")
	List iconList;

	WorldMapAreaData() {
	} // L: 14

	@ObfuscatedName("cq")
	@ObfuscatedSignature(
		descriptor = "(Lrd;Lrd;IZI)V",
		garbageValue = "-1685416357"
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

	@ObfuscatedName("cd")
	@ObfuscatedSignature(
		descriptor = "(Lrd;ZI)V",
		garbageValue = "-1057034559"
	)
	@Export("initIconsList")
	void initIconsList(Buffer var1, boolean var2) {
		this.iconList = new LinkedList(); // L: 46
		int var3 = var1.readUnsignedShort(); // L: 47

		for (int var4 = 0; var4 < var3; ++var4) { // L: 48
			int var5 = var1.method8709(); // L: 49
			Coord var6 = new Coord(var1.readInt()); // L: 50
			boolean var7 = var1.readUnsignedByte() == 1; // L: 51
			if (var2 || !var7) { // L: 52
				this.iconList.add(new WorldMapIcon_0((Coord)null, var6, var5, (WorldMapLabel)null)); // L: 53
			}
		}

	} // L: 56

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lcd;I)V",
		garbageValue = "-1936200764"
	)
	@Export("runScriptEvent")
	public static void runScriptEvent(ScriptEvent var0) {
		ItemLayer.runScript(var0, 500000, 475000); // L: 113
	} // L: 114

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "44"
	)
	static void method5426() {
		Login.Login_username = Login.Login_username.trim(); // L: 1058
		if (Login.Login_username.length() == 0) { // L: 1059
			class70.setLoginResponseString("Please enter your username.", "If you created your account after November", "2010, this will be the creation email address."); // L: 1060
		} else {
			long var1 = class70.method2085(); // L: 1064
			int var0;
			if (0L == var1) { // L: 1065
				var0 = 5;
			} else {
				var0 = Ignored.method7741(var1, Login.Login_username); // L: 1066
			}

			switch(var0) { // L: 1067
			case 2:
				class70.setLoginResponseString(Strings.field3943, Strings.field4118, Strings.field4119); // L: 1081
				ReflectionCheck.method696(6); // L: 1082
				break; // L: 1083
			case 3:
				class70.setLoginResponseString("", "Error connecting to server.", ""); // L: 1075
				break; // L: 1076
			case 4:
				class70.setLoginResponseString("The part of the website you are trying", "to connect to is offline at the moment.", "Please try again later."); // L: 1069
				break;
			case 5:
				class70.setLoginResponseString("Sorry, there was an error trying to", "log you in to this part of the website.", "Please try again later."); // L: 1078
				break; // L: 1079
			case 6:
				class70.setLoginResponseString("", "Error connecting to server.", ""); // L: 1085
				break;
			case 7:
				class70.setLoginResponseString("You must enter a valid login to proceed. For accounts", "created after 24th November 2010, please use your", "email address. Otherwise please use your username."); // L: 1072
			}

		}
	} // L: 1061 1088
}
