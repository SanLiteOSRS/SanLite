import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("WorldMapDecoration")
public class WorldMapDecoration {
	@ObfuscatedName("y")
	@Export("SpriteBuffer_xOffsets")
	public static int[] SpriteBuffer_xOffsets;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1317870659
	)
	static int field2082;
	@ObfuscatedName("hf")
	@ObfuscatedSignature(
		descriptor = "[Lop;"
	)
	@Export("modIconSprites")
	static IndexedSprite[] modIconSprites;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = -1952293629
	)
	@Export("objectDefinitionId")
	final int objectDefinitionId;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 739729953
	)
	@Export("decoration")
	final int decoration;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -184500109
	)
	@Export("rotation")
	final int rotation;

	WorldMapDecoration(int var1, int var2, int var3) {
		this.objectDefinitionId = var1;
		this.decoration = var2;
		this.rotation = var3;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Loz;"
	)
	@Export("newRunException")
	public static RunException newRunException(Throwable var0, String var1) {
		RunException var2;
		if (var0 instanceof RunException) {
			var2 = (RunException)var0;
			var2.message = var2.message + ' ' + var1;
		} else {
			var2 = new RunException(var0, var1);
		}

		return var2;
	}

	@ObfuscatedName("hb")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-1091351445"
	)
	static int method3627(int var0, int var1) {
		int var2 = var1 - 334;
		if (var2 < 0) {
			var2 = 0;
		} else if (var2 > 100) {
			var2 = 100;
		}

		int var3 = (Client.zoomWidth - Client.zoomHeight) * var2 / 100 + Client.zoomHeight;
		return var0 * var3 / 256;
	}
}
