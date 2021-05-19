import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ol")
public class class390 {
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = -223258731
	)
	public final int field4222;
	@ObfuscatedName("c")
	public Object field4221;

	public class390(int var1) {
		this.field4222 = var1;
	}

	public class390(int var1, Object var2) {
		this.field4222 = var1;
		this.field4221 = var2;
	}

	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object var1) {
		if (!(var1 instanceof class390)) {
			return false;
		} else {
			class390 var2 = (class390)var1;
			if (var2.field4221 == null && this.field4221 != null) {
				return false;
			} else if (this.field4221 == null && var2.field4221 != null) {
				return false;
			} else {
				return this.field4222 == var2.field4222 && var2.field4221.equals(this.field4221);
			}
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "40"
	)
	public static void method6744(int var0) {
		class232.musicPlayerStatus = 1;
		JagexCache.musicTrackArchive = null;
		class232.musicTrackGroupId = -1;
		class232.musicTrackFileId = -1;
		LoginPacket.musicTrackVolume = 0;
		VarpDefinition.musicTrackBoolean = false;
		class232.pcmSampleLength = var0;
	}
}
