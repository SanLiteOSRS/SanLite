import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nh")
final class class371 implements class370 {
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;Lnk;I)V",
		garbageValue = "-2099055755"
	)
	public void vmethod6366(Object var1, Buffer var2) {
		this.method6323((Integer)var1, var2);
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lnk;I)Ljava/lang/Object;",
		garbageValue = "-559339148"
	)
	public Object vmethod6362(Buffer var1) {
		return var1.readInt();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Integer;Lnk;I)V",
		garbageValue = "-121075266"
	)
	void method6323(Integer var1, Buffer var2) {
		var2.writeInt(var1);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1443919706"
	)
	public static void method6333() {
		try {
			if (class232.musicPlayerStatus == 1) {
				int var0 = class232.midiPcmStream.method4370();
				if (var0 > 0 && class232.midiPcmStream.isReady()) {
					var0 -= class232.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					class232.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class232.midiPcmStream.clear();
				class232.midiPcmStream.removeAll();
				if (JagexCache.musicTrackArchive != null) {
					class232.musicPlayerStatus = 2;
				} else {
					class232.musicPlayerStatus = 0;
				}

				NPC.musicTrack = null;
				class268.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class232.midiPcmStream.clear();
			class232.musicPlayerStatus = 0;
			NPC.musicTrack = null;
			class268.soundCache = null;
			JagexCache.musicTrackArchive = null;
		}

	}
}
