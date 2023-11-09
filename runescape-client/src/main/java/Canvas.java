import java.awt.Component;
import java.awt.Graphics;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("Canvas")
public final class Canvas extends java.awt.Canvas {
	@ObfuscatedName("ae")
	static int[][] field116;
	@ObfuscatedName("at")
	@Export("component")
	Component component;

	Canvas(Component var1) {
		this.component = var1; // L: 11
	} // L: 12

	public final void update(Graphics var1) {
		this.component.update(var1); // L: 15
	} // L: 16

	public final void paint(Graphics var1) {
		this.component.paint(var1);
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIIIIII)I",
		garbageValue = "1638552328"
	)
	public static int method327(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) { // L: 17
			int var6 = var3; // L: 18
			var3 = var4; // L: 19
			var4 = var6; // L: 20
		}

		var2 &= 3; // L: 22
		if (var2 == 0) { // L: 23
			return var0;
		} else if (var2 == 1) { // L: 24
			return var1;
		} else {
			return var2 == 2 ? 7 - var0 - (var3 - 1) : 7 - var1 - (var4 - 1); // L: 25 26
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhh;",
		garbageValue = "-109"
	)
	@Export("getEnum")
	public static EnumComposition getEnum(int var0) {
		EnumComposition var1 = (EnumComposition)EnumComposition.EnumDefinition_cached.get((long)var0); // L: 29
		if (var1 != null) { // L: 30
			return var1;
		} else {
			byte[] var2 = EnumComposition.EnumDefinition_archive.takeFile(8, var0); // L: 31
			var1 = new EnumComposition(); // L: 32
			if (var2 != null) { // L: 33
				var1.decode(new Buffer(var2));
			}

			EnumComposition.EnumDefinition_cached.put(var1, (long)var0); // L: 34
			return var1; // L: 35
		}
	}

	@ObfuscatedName("nb")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "-1"
	)
	static String method326(String var0) {
		PlayerType[] var1 = HealthBarDefinition.PlayerType_values(); // L: 12750

		for (int var2 = 0; var2 < var1.length; ++var2) { // L: 12751
			PlayerType var3 = var1[var2]; // L: 12752
			if (var3.modIcon != -1 && var0.startsWith(class100.method2624(var3.modIcon))) { // L: 12754 12755
				var0 = var0.substring(6 + Integer.toString(var3.modIcon).length()); // L: 12756
				break;
			}
		}

		return var0; // L: 12763
	}
}
