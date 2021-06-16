import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("Frames")
public class Frames extends DualNode {
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "[Lgz;"
	)
	@Export("frames")
	Animation[] frames;

	@ObfuscatedSignature(
		descriptor = "(Ljp;Ljp;IZ)V"
	)
	Frames(AbstractArchive var1, AbstractArchive var2, int var3, boolean var4) {
		NodeDeque var5 = new NodeDeque();
		int var6 = var1.getGroupFileCount(var3);
		this.frames = new Animation[var6];
		int[] var7 = var1.getGroupFileIds(var3);

		for (int var8 = 0; var8 < var7.length; ++var8) {
			byte[] var9 = var1.takeFile(var3, var7[var8]);
			Skeleton var10 = null;
			int var11 = (var9[0] & 255) << 8 | var9[1] & 255;

			for (Skeleton var12 = (Skeleton)var5.last(); var12 != null; var12 = (Skeleton)var5.previous()) {
				if (var11 == var12.id) {
					var10 = var12;
					break;
				}
			}

			if (var10 == null) {
				byte[] var13;
				if (var4) {
					var13 = var2.getFile(0, var11);
				} else {
					var13 = var2.getFile(var11, 0);
				}

				var10 = new Skeleton(var11, var13);
				var5.addFirst(var10);
			}

			this.frames[var7[var8]] = new Animation(var9, var10);
		}

	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "1512659835"
	)
	@Export("hasAlphaTransform")
	public boolean hasAlphaTransform(int var1) {
		return this.frames[var1].hasAlphaTransform;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-9614"
	)
	public static void method4257() {
		try {
			if (class233.musicPlayerStatus == 1) {
				int var0 = class233.midiPcmStream.method4660();
				if (var0 > 0 && class233.midiPcmStream.isReady()) {
					var0 -= FaceNormal.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					class233.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class233.midiPcmStream.clear();
				class233.midiPcmStream.removeAll();
				if (InvDefinition.musicTrackArchive != null) {
					class233.musicPlayerStatus = 2;
				} else {
					class233.musicPlayerStatus = 0;
				}

				ArchiveLoader.musicTrack = null;
				class215.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class233.midiPcmStream.clear();
			class233.musicPlayerStatus = 0;
			ArchiveLoader.musicTrack = null;
			class215.soundCache = null;
			InvDefinition.musicTrackArchive = null;
		}

	}
}
