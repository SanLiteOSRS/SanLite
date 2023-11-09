import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("no")
@Implements("NetFileRequest")
public class NetFileRequest extends DualNode {
	@ObfuscatedName("mc")
	@ObfuscatedGetter(
		intValue = 2112658965
	)
	@Export("Client_plane")
	static int Client_plane;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnv;"
	)
	@Export("archive")
	public Archive archive;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = -64399123
	)
	@Export("crc")
	public int crc;
	@ObfuscatedName("ar")
	@Export("padding")
	public byte padding;

	NetFileRequest() {
	} // L: 10

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lni;I)V",
		garbageValue = "1609486761"
	)
	public static void method6721(AbstractArchive var0) {
		VarbitComposition.VarbitDefinition_archive = var0; // L: 28
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(IIII)D",
		garbageValue = "581276487"
	)
	static double method6720(int var0, int var1, int var2) {
		double var3 = var1 > 0 ? (double)Math.max(0.0F, Math.min(1.0F, (float)var0 / (float)var1)) : 1.0D; // L: 29
		if (var3 > 0.0D && var3 < 1.0D) { // L: 30
			double var5;
			double var7;
			switch(var2) { // L: 33
			case 0:
				return var3; // L: 72
			case 1:
				return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D); // L: 51
			case 2:
				return Math.sin(var3 * 3.141592653589793D / 2.0D); // L: 58
			case 3:
				return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D; // L: 100
			case 4:
				return var3 * var3; // L: 102
			case 5:
				return 1.0D - (1.0D - var3) * (1.0D - var3); // L: 92
			case 6:
				return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(-2.0D * var3 + 2.0D, 2.0D) / 2.0D; // L: 70
			case 7:
				return var3 * var3 * var3; // L: 35
			case 8:
				return 1.0D - Math.pow(1.0D - var3, 3.0D); // L: 37
			case 9:
				return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(2.0D + var3 * -2.0D, 3.0D) / 2.0D; // L: 68
			case 10:
				return var3 * var3 * var3 * var3; // L: 41
			case 11:
				return 1.0D - Math.pow(1.0D - var3, 4.0D); // L: 39
			case 12:
				return var3 < 0.5D ? 8.0D * var3 * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D; // L: 49
			case 13:
				return var3 * var3 * var3 * var3 * var3; // L: 60
			case 14:
				return 1.0D - Math.pow(1.0D - var3, 5.0D); // L: 96
			case 15:
				return var3 < 0.5D ? var3 * var3 * var3 * var3 * 8.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D; // L: 104
			case 16:
				return Math.pow(2.0D, var3 * 10.0D - 10.0D); // L: 94
			case 17:
				return 1.0D - Math.pow(2.0D, var3 * -10.0D); // L: 84
			case 18:
				return var3 < 0.5D ? Math.pow(2.0D, var3 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, 10.0D + var3 * -20.0D)) / 2.0D; // L: 74
			case 19:
				return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D)); // L: 98
			case 20:
				return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D)); // L: 82
			case 21:
				return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(2.0D * var3, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(2.0D + -2.0D * var3, 2.0D)) + 1.0D) / 2.0D; // L: 111
			case 22:
				var5 = 1.70158D; // L: 87
				var7 = 2.70158D; // L: 88
				return 2.70158D * var3 * var3 * var3 - var3 * 1.70158D * var3; // L: 89
			case 23:
				var5 = 1.70158D; // L: 44
				var7 = 2.70158D; // L: 45
				return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D); // L: 46
			case 24:
				var5 = 1.70158D; // L: 63
				var7 = 2.5949095D; // L: 64
				return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(2.0D * var3 - 2.0D, 2.0D) * (2.5949095D + (var3 * 2.0D - 2.0D) * 3.5949095D) + 2.0D) / 2.0D; // L: 65
			case 25:
				var5 = 2.0943951023931953D; // L: 54
				return -Math.pow(2.0D, 10.0D * var3 - 10.0D) * Math.sin(2.0943951023931953D * (10.0D * var3 - 10.75D)); // L: 55
			case 26:
				var5 = 2.0943951023931953D; // L: 107
				return Math.pow(2.0D, -10.0D * var3) * Math.sin((var3 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D; // L: 108
			case 27:
				var5 = 1.3962634015954636D; // L: 77
				var7 = Math.sin(1.3962634015954636D * (var3 * 20.0D - 11.125D)); // L: 78
				return var3 < 0.5D ? -(Math.pow(2.0D, 20.0D * var3 - 10.0D) * var7) / 2.0D : Math.pow(2.0D, 10.0D + -20.0D * var3) * var7 / 2.0D + 1.0D; // L: 79
			default:
				return var3; // L: 113
			}
		} else {
			return var3 <= 0.0D ? 0.0D : 1.0D; // L: 31
		}
	}
}
