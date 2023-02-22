import java.net.MalformedURLException;
import java.net.URL;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gs")
public class class194 extends DualNode {
	static {
		new EvictingDualNodeHashTable(64); // L: 9
	} // L: 10

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(ILrd;B)Lfy;",
		garbageValue = "-87"
	)
	public static class179 method3810(int var0, Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 24
		boolean var3 = (var2 & 1) != 0; // L: 25
		boolean var4 = (var2 & 2) != 0; // L: 26
		class179 var5 = new class179(var0); // L: 27
		int var6;
		int[] var7;
		boolean var8;
		int var9;
		short var10;
		if (var3) { // L: 28
			var6 = var1.readUnsignedByte(); // L: 29
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 30 31 32
			var8 = var5.field1913 != null && var7.length == var5.field1913.length; // L: 33

			for (var9 = 0; var9 < 2; ++var9) { // L: 34
				if (var7[var9] != 15) { // L: 35
					var10 = (short)var1.readUnsignedShort(); // L: 36
					if (var8) { // L: 37
						var5.field1913[var7[var9]] = var10; // L: 38
					}
				}
			}
		}

		if (var4) { // L: 43
			var6 = var1.readUnsignedByte(); // L: 44
			var7 = new int[]{var6 & 15, var6 >> 4 & 15}; // L: 45 46 47
			var8 = var5.field1914 != null && var7.length == var5.field1914.length; // L: 48

			for (var9 = 0; var9 < 2; ++var9) { // L: 49
				if (var7[var9] != 15) { // L: 50
					var10 = (short)var1.readUnsignedShort(); // L: 51
					if (var8) { // L: 52
						var5.field1914[var7[var9]] = var10; // L: 53
					}
				}
			}
		}

		return var5; // L: 58
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Z",
		garbageValue = "1472562241"
	)
	static boolean method3807(String var0) {
		if (var0 == null) { // L: 186
			return false;
		} else {
			try {
				new URL(var0);
				return true; // L: 193
			} catch (MalformedURLException var2) { // L: 190
				return false; // L: 191
			}
		}
	}

	@ObfuscatedName("mn")
	@ObfuscatedSignature(
		descriptor = "(ZI)V",
		garbageValue = "1730669881"
	)
	static void method3809(boolean var0) {
		Client.field648 = var0; // L: 13388
	} // L: 13389
}
