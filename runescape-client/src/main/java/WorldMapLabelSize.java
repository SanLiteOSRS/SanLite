import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("jt")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Ljt;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("jo")
	@Export("regionLandArchives")
	static byte[][] regionLandArchives;
	@ObfuscatedName("as")
	@ObfuscatedGetter(
		intValue = 976233299
	)
	final int field2861;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -1012793205
	)
	final int field2868;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1283115681
	)
	final int field2865;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(1, 0, 4); // L: 7
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2); // L: 8
		WorldMapLabelSize_large = new WorldMapLabelSize(0, 2, 0); // L: 9
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field2861 = var1; // L: 15
		this.field2868 = var2; // L: 16
		this.field2865 = var3; // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(FB)Z",
		garbageValue = "89"
	)
	boolean method5061(float var1) {
		return var1 >= (float)this.field2865; // L: 21
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(II)Lhy;",
		garbageValue = "272884166"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("li")
	@ObfuscatedSignature(
		descriptor = "(IIIIII)V",
		garbageValue = "-1040672320"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		class411.scrollBarSprites[0].drawAt(var0, var1); // L: 11157
		class411.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16); // L: 11158
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field582); // L: 11159
		int var5 = var3 * (var3 - 32) / var4; // L: 11160
		if (var5 < 8) { // L: 11161
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3); // L: 11162
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field583); // L: 11163
		Rasterizer2D.method9264(var0, var6 + var1 + 16, var5, Client.field799); // L: 11164
		Rasterizer2D.method9264(var0 + 1, var6 + var1 + 16, var5, Client.field799); // L: 11165
		Rasterizer2D.method9262(var0, var6 + var1 + 16, 16, Client.field799); // L: 11166
		Rasterizer2D.method9262(var0, var6 + var1 + 17, 16, Client.field799); // L: 11167
		Rasterizer2D.method9264(var0 + 15, var6 + var1 + 16, var5, Client.field584); // L: 11168
		Rasterizer2D.method9264(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field584); // L: 11169
		Rasterizer2D.method9262(var0, var6 + var5 + var1 + 15, 16, Client.field584); // L: 11170
		Rasterizer2D.method9262(var0 + 1, var5 + var6 + var1 + 14, 15, Client.field584); // L: 11171
	} // L: 11172
}
