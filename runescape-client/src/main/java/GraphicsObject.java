import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cm")
@Implements("GraphicsObject")
public final class GraphicsObject extends Renderable {
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -1326465881
	)
	@Export("height")
	int height;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1027327973
	)
	@Export("id")
	int id;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1536729399
	)
	@Export("cycleStart")
	int cycleStart;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1152665819
	)
	@Export("plane")
	int plane;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1500063053
	)
	@Export("x")
	int x;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = -1460229241
	)
	@Export("y")
	int y;
	@ObfuscatedName("x")
	@ObfuscatedSignature(
		signature = "Ljm;"
	)
	@Export("sequenceDefinition")
	SequenceDefinition sequenceDefinition;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = 1933421917
	)
	@Export("frame")
	int frame;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 1610487487
	)
	@Export("frameCycle")
	int frameCycle;
	@ObfuscatedName("m")
	@Export("isFinished")
	boolean isFinished;

	GraphicsObject(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
		this.frame = 0;
		this.frameCycle = 0;
		this.isFinished = false;
		this.id = var1;
		this.plane = var2;
		this.x = var3;
		this.y = var4;
		this.height = var5;
		this.cycleStart = var7 + var6;
		int var8 = Tiles.SpotAnimationDefinition_get(this.id).sequence;
		if (var8 != -1) {
			this.isFinished = false;
			this.sequenceDefinition = WorldMapRegion.SequenceDefinition_get(var8);
		} else {
			this.isFinished = true;
		}

	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "-1653124671"
	)
	@Export("advance")
	final void advance(int var1) {
		if (!this.isFinished) {
			this.frameCycle += var1;

			while (this.frameCycle > this.sequenceDefinition.frameLengths[this.frame]) {
				this.frameCycle -= this.sequenceDefinition.frameLengths[this.frame];
				++this.frame;
				if (this.frame >= this.sequenceDefinition.frameIds.length) {
					this.isFinished = true;
					break;
				}
			}

		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		signature = "(I)Ler;",
		garbageValue = "-2026237468"
	)
	@Export("getModel")
	protected final Model getModel() {
		SpotAnimationDefinition var1 = Tiles.SpotAnimationDefinition_get(this.id);
		Model var2;
		if (!this.isFinished) {
			var2 = var1.getModel(this.frame);
		} else {
			var2 = var1.getModel(-1);
		}

		return var2 == null ? null : var2;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "104"
	)
	static void method2091() {
		try {
			File var0 = new File(UserComparator2.userHomeDirectory, "random.dat");
			int var2;
			if (var0.exists()) {
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			} else {
				label38:
				for (int var1 = 0; var1 < class69.field570.length; ++var1) {
					for (var2 = 0; var2 < UserComparator4.field2005.length; ++var2) {
						File var3 = new File(UserComparator4.field2005[var2] + class69.field570[var1] + File.separatorChar + "random.dat");
						if (var3.exists()) {
							JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var3, "rw", 25L), 24, 0);
							break label38;
						}
					}
				}
			}

			if (JagexCache.JagexCache_randomDat == null) {
				RandomAccessFile var4 = new RandomAccessFile(var0, "rw");
				var2 = var4.read();
				var4.seek(0L);
				var4.write(var2);
				var4.seek(0L);
				var4.close();
				JagexCache.JagexCache_randomDat = new BufferedFile(new AccessFile(var0, "rw", 25L), 24, 0);
			}
		} catch (IOException var5) {
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1643627841"
	)
	public static void method2095() {
		try {
			if (class206.field2437 == 1) {
				int var0 = class206.midiPcmStream.method3806();
				if (var0 > 0 && class206.midiPcmStream.isReady()) {
					var0 -= FaceNormal.field1922;
					if (var0 < 0) {
						var0 = 0;
					}

					class206.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class206.midiPcmStream.clear();
				class206.midiPcmStream.removeAll();
				if (class204.musicTrackArchive != null) {
					class206.field2437 = 2;
				} else {
					class206.field2437 = 0;
				}

				class206.musicTrack = null;
				class39.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class206.midiPcmStream.clear();
			class206.field2437 = 0;
			class206.musicTrack = null;
			class39.soundCache = null;
			class204.musicTrackArchive = null;
		}

	}
}
