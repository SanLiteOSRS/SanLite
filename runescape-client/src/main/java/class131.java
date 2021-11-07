import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
public class class131 extends class116 {
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -1300731739
	)
	static int field1485;
	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "Lkj;"
	)
	@Export("NetCache_currentResponse")
	public static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		longValue = -7049203579552523343L
	)
	long field1487;
	@ObfuscatedName("w")
	String field1486;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -121846283
	)
	int field1489;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Ldg;"
	)
	final class119 this$0;

	@ObfuscatedSignature(
		descriptor = "(Ldg;)V"
	)
	class131(class119 var1) {
		this.this$0 = var1;
		this.field1487 = -1L;
		this.field1486 = null;
		this.field1489 = 0;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lop;I)V",
		garbageValue = "-2002779676"
	)
	void vmethod2847(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field1487 = var1.readLong();
		}

		this.field1486 = var1.readStringCp1252NullTerminatedOrNull();
		this.field1489 = var1.readUnsignedShort();
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(Ldm;I)V",
		garbageValue = "-293908864"
	)
	void vmethod2848(ClanSettings var1) {
		var1.method2655(this.field1487, this.field1486, this.field1489);
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-474591339"
	)
	public static void method2753() {
		try {
			if (class247.musicPlayerStatus == 1) {
				int var0 = class247.midiPcmStream.method4754();
				if (var0 > 0 && class247.midiPcmStream.isReady()) {
					var0 -= class247.pcmSampleLength;
					if (var0 < 0) {
						var0 = 0;
					}

					class247.midiPcmStream.setPcmStreamVolume(var0);
					return;
				}

				class247.midiPcmStream.clear();
				class247.midiPcmStream.removeAll();
				if (class128.musicTrackArchive != null) {
					class247.musicPlayerStatus = 2;
				} else {
					class247.musicPlayerStatus = 0;
				}

				class14.musicTrack = null;
				class247.soundCache = null;
			}
		} catch (Exception var2) {
			var2.printStackTrace();
			class247.midiPcmStream.clear();
			class247.musicPlayerStatus = 0;
			class14.musicTrack = null;
			class247.soundCache = null;
			class128.musicTrackArchive = null;
		}

	}
}
