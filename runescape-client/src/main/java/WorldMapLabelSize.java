import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("iq")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("vf")
	@ObfuscatedGetter(
		longValue = -4916200356723856723L
	)
	static long field2824;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Liq;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1619983487
	)
	final int field2829;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = 547050313
	)
	final int field2828;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = 1330231937
	)
	final int field2830;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(2, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(0, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2829 = var1; // L: 19
		this.field2828 = var2; // L: 20
		this.field2830 = var3; // L: 21
	} // L: 22

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(FI)Z",
		garbageValue = "-1921654209"
	)
	boolean method4859(float var1) {
		return var1 >= (float)this.field2830; // L: 25
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)[Liq;",
		garbageValue = "-1709132598"
	)
	static WorldMapLabelSize[] method4851() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_medium, WorldMapLabelSize_large, WorldMapLabelSize_small}; // L: 15
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZI)Z",
		garbageValue = "-823658761"
	)
	public static boolean method4858(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 149
			int var3 = var2.read(); // L: 150
			var2.seek(0L); // L: 151
			var2.write(var3); // L: 152
			var2.seek(0L); // L: 153
			var2.close(); // L: 154
			if (var1) { // L: 155
				var0.delete();
			}

			return true; // L: 156
		} catch (Exception var4) { // L: 158
			return false; // L: 159
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1850317115"
	)
	@Export("isDigit")
	public static boolean isDigit(char var0) {
		return var0 >= '0' && var0 <= '9'; // L: 143
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(ILbm;ZB)I",
		garbageValue = "1"
	)
	static int method4852(int var0, Script var1, boolean var2) {
		if (var0 == 7463) { // L: 4918
			boolean var3 = Interpreter.Interpreter_intStack[--class87.Interpreter_intStackSize] == 1; // L: 4919
			ItemLayer.method4198(var3); // L: 4920
			return 1; // L: 4921
		} else {
			return 2; // L: 4923
		}
	}

	@ObfuscatedName("lw")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "228437568"
	)
	static void method4861(int var0, int var1) {
		class276.method5485(PendingSpawn.tempMenuAction, var0, var1); // L: 12020
		PendingSpawn.tempMenuAction = null; // L: 12021
	} // L: 12022
}
