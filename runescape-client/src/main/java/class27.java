import java.util.Arrays;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bw")
public class class27 {
	@ObfuscatedName("uk")
	@ObfuscatedGetter(
		intValue = -1081133447
	)
	static int field119;
	@ObfuscatedName("ck")
	static String field127;
	@ObfuscatedName("iz")
	@ObfuscatedGetter(
		intValue = -1338281283
	)
	static int field130;
	@ObfuscatedName("al")
	int[] field123;
	@ObfuscatedName("aj")
	int[] field128;

	public class27() {
		this.field123 = new int[112]; // L: 12
		this.field128 = new int[192]; // L: 13
		Arrays.fill(this.field123, 3); // L: 16
		Arrays.fill(this.field128, 3); // L: 17
	} // L: 18

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "-567194638"
	)
	public void method392(int var1, int var2) {
		if (this.method385(var1) && this.method389(var2)) { // L: 21
			this.field123[var1] = var2; // L: 22
		}

	} // L: 24

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(CII)V",
		garbageValue = "-218801950"
	)
	public void method371(char var1, int var2) {
		if (this.method379(var1) && this.method389(var2)) { // L: 27
			this.field128[var1] = var2; // L: 28
		}

	} // L: 30

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-1783067246"
	)
	public int method377(int var1) {
		return this.method385(var1) ? this.field123[var1] : 0; // L: 33 34 36
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(CI)I",
		garbageValue = "1699593714"
	)
	public int method373(char var1) {
		return this.method379(var1) ? this.field128[var1] : 0; // L: 40 41 43
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "14"
	)
	public boolean method374(int var1) {
		return this.method385(var1) && (this.field123[var1] == 1 || this.field123[var1] == 3); // L: 47
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(CB)Z",
		garbageValue = "29"
	)
	public boolean method375(char var1) {
		return this.method379(var1) && (this.field128[var1] == 1 || this.field128[var1] == 3); // L: 51
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IS)Z",
		garbageValue = "-20734"
	)
	public boolean method376(int var1) {
		return this.method385(var1) && (this.field123[var1] == 2 || this.field123[var1] == 3); // L: 55
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "-1302369729"
	)
	public boolean method397(char var1) {
		return this.method379(var1) && (this.field128[var1] == 2 || this.field128[var1] == 3); // L: 59
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "91"
	)
	boolean method385(int var1) {
		if (var1 >= 0 && var1 < 112) { // L: 63
			return true; // L: 67
		} else {
			System.out.println("Invalid keycode: " + var1); // L: 64
			return false; // L: 65
		}
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1335431123"
	)
	boolean method379(char var1) {
		if (var1 >= 0 && var1 < 192) { // L: 71
			return true; // L: 75
		} else {
			System.out.println("Invalid keychar: " + var1); // L: 72
			return false; // L: 73
		}
	}

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-1858009148"
	)
	boolean method389(int var1) {
		if (var1 >= 0 && var1 < 4) { // L: 79
			return true; // L: 83
		} else {
			System.out.println("Invalid mode: " + var1); // L: 80
			return false; // L: 81
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Lct;",
		garbageValue = "7309577"
	)
	@Export("worldListStart")
	static World worldListStart() {
		World.World_listCount = 0; // L: 247
		return WorldMapSectionType.getNextWorldListWorld(); // L: 248
	}

	@ObfuscatedName("ho")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1685249737"
	)
	static void method411() {
		Client.packetWriter.clearBuffer(); // L: 2879
		Client.packetWriter.packetBuffer.offset = 0; // L: 2880
		Client.packetWriter.serverPacket = null; // L: 2881
		Client.packetWriter.field1392 = null; // L: 2882
		Client.packetWriter.field1381 = null; // L: 2883
		Client.packetWriter.field1394 = null; // L: 2884
		Client.packetWriter.serverPacketLength = 0; // L: 2885
		Client.packetWriter.field1390 = 0; // L: 2886
		Client.rebootTimer = 0; // L: 2887
		class25.method368(); // L: 2888
		Client.minimapState = 0; // L: 2889
		Client.destinationX = 0; // L: 2890

		int var0;
		for (var0 = 0; var0 < 2048; ++var0) { // L: 2891
			Client.players[var0] = null;
		}

		HitSplatDefinition.localPlayer = null; // L: 2892

		for (var0 = 0; var0 < Client.npcs.length; ++var0) { // L: 2893
			NPC var1 = Client.npcs[var0]; // L: 2894
			if (var1 != null) { // L: 2895
				var1.targetIndex = -1; // L: 2896
				var1.false0 = false; // L: 2897
			}
		}

		WorldMapSectionType.method5452(); // L: 2900
		class47.method867(30); // L: 2901

		for (var0 = 0; var0 < 100; ++var0) { // L: 2902
			Client.field693[var0] = true;
		}

		class407.method7663(); // L: 2903
	} // L: 2904
}
