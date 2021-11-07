import java.util.Comparator;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
@Implements("UserComparator1")
public class UserComparator1 implements Comparator {
	@ObfuscatedName("i")
	@Export("reversed")
	final boolean reversed;

	public UserComparator1(boolean var1) {
		this.reversed = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lla;Lla;S)I",
		garbageValue = "-7375"
	)
	@Export("compare_bridged")
	int compare_bridged(Nameable var1, Nameable var2) {
		return this.reversed ? var1.compareTo_user(var2) : var2.compareTo_user(var1);
	}

	public int compare(Object var1, Object var2) {
		return this.compare_bridged((Nameable)var1, (Nameable)var2);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lko;Lko;Ljava/lang/String;Ljava/lang/String;I)Lle;",
		garbageValue = "976267291"
	)
	public static Font method7234(AbstractArchive var0, AbstractArchive var1, String var2, String var3) {
		int var4 = var0.getGroupId(var2);
		int var5 = var0.getFileId(var4, var3);
		Font var6;
		if (!BuddyRankComparator.SpriteBuffer_loadSpritesFromArchive(var0, var4, var5)) {
			var6 = null;
		} else {
			byte[] var8 = var1.takeFile(var4, var5);
			Font var7;
			if (var8 == null) {
				var7 = null;
			} else {
				Font var9 = new Font(var8, class414.SpriteBuffer_xOffsets, class414.SpriteBuffer_yOffsets, UrlRequester.SpriteBuffer_spriteWidths, class414.SpriteBuffer_spriteHeights, HitSplatDefinition.SpriteBuffer_spritePalette, class295.SpriteBuffer_pixels);
				PacketBuffer.method6913();
				var7 = var9;
			}

			var6 = var7;
		}

		return var6;
	}
}
