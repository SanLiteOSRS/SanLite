import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sz")
public class class478 {
	@ObfuscatedName("aj")
	int[] field4907;
	@ObfuscatedName("al")
	short[] field4908;

	@ObfuscatedSignature(
		descriptor = "(Lhl;)V"
	)
	public class478(NPCComposition var1) {
		this.field4907 = new int[8]; // L: 10
		this.field4908 = new short[8]; // L: 11
		int var2 = 0; // L: 12
		if (var1.method3676()) { // L: 13
			var2 = var1.method3677().length; // L: 14
			System.arraycopy(var1.method3677(), 0, this.field4907, 0, var2); // L: 15
			System.arraycopy(var1.method3673(), 0, this.field4908, 0, var2); // L: 16
		}

		for (int var3 = var2; var3 < 8; ++var3) { // L: 18
			this.field4907[var3] = -1; // L: 19
			this.field4908[var3] = -1; // L: 20
		}

	} // L: 22

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(B)[I",
		garbageValue = "1"
	)
	public int[] method8882() {
		return this.field4907; // L: 25
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(B)[S",
		garbageValue = "-127"
	)
	public short[] method8883() {
		return this.field4908; // L: 29
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(IISI)V",
		garbageValue = "-421594024"
	)
	public void method8884(int var1, int var2, short var3) {
		this.field4907[var1] = var2; // L: 33
		this.field4908[var1] = var3; // L: 34
	} // L: 35

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "([I[SB)V",
		garbageValue = "29"
	)
	public void method8881(int[] var1, short[] var2) {
		this.field4907 = var1; // L: 38
		this.field4908 = var2; // L: 39
	} // L: 40

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(Lne;Lne;Ljava/lang/String;Ljava/lang/String;I)Loe;",
		garbageValue = "2073726853"
	)
	public static Font method8894(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2); // L: 95
		int var5 = var0.getFileId(var4, var3); // L: 96
		byte[] var8 = var0.takeFile(var4, var5); // L: 101
		boolean var7;
		if (var8 == null) { // L: 102
			var7 = false; // L: 103
		} else {
			class212.SpriteBuffer_decode(var8); // L: 106
			var7 = true; // L: 107
		}

		Font var6;
		if (!var7) { // L: 109
			var6 = null; // L: 110
		} else {
			byte[] var9 = var1.takeFile(var4, var5); // L: 114
			Font var11;
			if (var9 == null) { // L: 116
				var11 = null; // L: 117
			} else {
				Font var10 = new Font(var9, class492.SpriteBuffer_xOffsets, Canvas.SpriteBuffer_yOffsets, InterfaceParent.SpriteBuffer_spriteWidths, class144.SpriteBuffer_spriteHeights, class181.SpriteBuffer_spritePalette, class144.SpriteBuffer_pixels); // L: 120
				FriendsList.method7473(); // L: 121
				var11 = var10; // L: 122
			}

			var6 = var11; // L: 124
		}

		return var6; // L: 126
	}
}
