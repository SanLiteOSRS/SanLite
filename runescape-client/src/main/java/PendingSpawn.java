import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("PendingSpawn")
public final class PendingSpawn extends Node {
	@ObfuscatedName("ub")
	@ObfuscatedGetter(
		intValue = -927036032
	)
	static int field1182;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -1211585979
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 1068935697
	)
	@Export("type")
	int type;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -762118645
	)
	@Export("x")
	int x;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = -359817879
	)
	@Export("y")
	int y;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 757477475
	)
	@Export("objectId")
	int objectId;
	@ObfuscatedName("ai")
	@ObfuscatedGetter(
		intValue = 2102589387
	)
	int field1185;
	@ObfuscatedName("az")
	@ObfuscatedGetter(
		intValue = -77659419
	)
	int field1186;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -517961703
	)
	int field1187;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -29963369
	)
	int field1189;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = 1851896147
	)
	int field1183;
	@ObfuscatedName("ad")
	@ObfuscatedGetter(
		intValue = -61676879
	)
	int field1190;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1398168629
	)
	int field1191;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1120217811
	)
	@Export("delay")
	int delay;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = -649567293
	)
	@Export("hitpoints")
	int hitpoints;

	PendingSpawn() {
		this.field1191 = 31; // L: 18
		this.delay = 0; // L: 19
		this.hitpoints = -1; // L: 20
	} // L: 22

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-390756021"
	)
	void method2360(int var1) {
		this.field1191 = var1; // L: 25
	} // L: 26

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1725061454"
	)
	boolean method2362(int var1) {
		if (var1 >= 0 && var1 <= 4) { // L: 29
			return (this.field1191 & 1 << var1) != 0; // L: 30
		} else {
			return true; // L: 32
		}
	}

	@ObfuscatedName("au")
	public static final void method2365(long var0) {
		if (var0 > 0L) { // L: 9
			if (0L == var0 % 10L) { // L: 10
				WorldMapData_0.method5047(var0 - 1L); // L: 11
				WorldMapData_0.method5047(1L); // L: 12
			} else {
				WorldMapData_0.method5047(var0); // L: 14
			}

		}
	} // L: 15

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1525376195"
	)
	static boolean method2369(String var0) {
		if (var0 == null) { // L: 159
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 166
			} catch (MalformedURLException var2) { // L: 163
				return false; // L: 164
			}
		}
	}

	@ObfuscatedName("hm")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "334043095"
	)
	static final void method2368(boolean var0) {
		if (var0) { // L: 3006
			Client.field776 = Login.field956 ? class139.field1647 : class139.field1646; // L: 3007
		} else {
			Client.field776 = class449.clientPreferences.method2472(Login.Login_username) ? class139.field1650 : class139.field1653; // L: 3010
		}

	} // L: 3012
}
