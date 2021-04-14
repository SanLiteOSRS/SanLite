import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ge")
@Implements("VertexNormal")
public class VertexNormal {
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1974778043
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -537542863
	)
	@Export("y")
	int y;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		intValue = 987855995
	)
	@Export("z")
	int z;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1799823947
	)
	@Export("magnitude")
	int magnitude;

	VertexNormal() {
	}

	@ObfuscatedSignature(
		signature = "(Lge;)V"
	)
	VertexNormal(VertexNormal var1) {
		this.x = var1.x;
		this.y = var1.y;
		this.z = var1.z;
		this.magnitude = var1.magnitude;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lir;Lir;S)V",
		garbageValue = "6851"
	)
	public static void method3782(AbstractArchive var0, AbstractArchive var1) {
		HealthBarDefinition.HealthBarDefinition_archive = var0;
		HealthBarDefinition.HitSplatDefinition_spritesArchive = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lir;II)Low;",
		garbageValue = "577836402"
	)
	public static IndexedSprite method3783(AbstractArchive var0, int var1) {
		byte[] var3 = var0.takeFileFlat(var1);
		boolean var2;
		if (var3 == null) {
			var2 = false;
		} else {
			class244.SpriteBuffer_decode(var3);
			var2 = true;
		}

		return !var2 ? null : ArchiveLoader.method2076();
	}
}
