import java.io.File;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dq")
public class class126 implements class342 {
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1519;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1529;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1514;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1525;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1512;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1517;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1518;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1513;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1520;
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1524;
	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1522;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1523;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1515;
	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1528;
	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1526;
	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1532;
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "Ldq;"
	)
	static final class126 field1527;
	@ObfuscatedName("ao")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -2084525283
	)
	final int field1521;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1661889385
	)
	final int field1530;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 241060171
	)
	final int field1531;

	static {
		field1519 = new class126(0, 0, (String)null, -1, -1); // L: 42
		field1529 = new class126(1, 1, (String)null, 0, 2); // L: 43
		field1514 = new class126(2, 2, (String)null, 1, 2); // L: 44
		field1525 = new class126(3, 3, (String)null, 2, 2); // L: 45
		field1512 = new class126(4, 4, (String)null, 3, 1); // L: 46
		field1517 = new class126(5, 5, (String)null, 4, 1); // L: 47
		field1518 = new class126(6, 6, (String)null, 5, 1); // L: 48
		field1513 = new class126(7, 7, (String)null, 6, 3); // L: 49
		field1520 = new class126(8, 8, (String)null, 7, 3); // L: 50
		field1524 = new class126(9, 9, (String)null, 8, 3); // L: 51
		field1522 = new class126(10, 10, (String)null, 0, 7); // L: 52
		field1523 = new class126(11, 11, (String)null, 1, 7); // L: 53
		field1515 = new class126(12, 12, (String)null, 2, 7); // L: 54
		field1528 = new class126(13, 13, (String)null, 3, 7); // L: 55
		field1526 = new class126(14, 14, (String)null, 4, 7); // L: 56
		field1532 = new class126(15, 15, (String)null, 5, 7); // L: 57
		field1527 = new class126(16, 16, (String)null, 0, 5); // L: 58
	}

	@ObfuscatedSignature(
		descriptor = "(IILjava/lang/String;II)V",
		garbageValue = "-1"
	)
	class126(int var1, int var2, String var3, int var4, int var5) {
		this.field1521 = var1; // L: 68
		this.field1530 = var2; // L: 69
		this.field1531 = var4; // L: 70
	} // L: 71

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "0"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field1530; // L: 74
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1737952549"
	)
	int method2907() {
		return this.field1531; // L: 78
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;I)V",
		garbageValue = "-1465265881"
	)
	public static void method2917(File var0) {
		FileSystem.FileSystem_cacheDir = var0; // L: 16
		if (!FileSystem.FileSystem_cacheDir.exists()) { // L: 17
			throw new RuntimeException("");
		} else {
			FileSystem.FileSystem_hasPermissions = true; // L: 18
		}
	} // L: 19

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-166821717"
	)
	static void method2911() {
		if (Client.field500 && class296.localPlayer != null) { // L: 12762
			int var0 = class296.localPlayer.pathX[0]; // L: 12763
			int var1 = class296.localPlayer.pathY[0]; // L: 12764
			if (var0 < 0 || var1 < 0 || var0 >= 104 || var1 >= 104) { // L: 12765
				return;
			}

			class31.oculusOrbFocalPointX = class296.localPlayer.x; // L: 12766
			int var2 = class132.getTileHeight(class296.localPlayer.x, class296.localPlayer.y, ApproximateRouteStrategy.Client_plane) - Client.camFollowHeight; // L: 12767
			if (var2 < VarpDefinition.field1869) { // L: 12768
				VarpDefinition.field1869 = var2;
			}

			PendingSpawn.oculusOrbFocalPointY = class296.localPlayer.y; // L: 12769
			Client.field500 = false; // L: 12770
		}

	} // L: 12772
}
