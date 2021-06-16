import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("k")
public class class13 extends class14 {
	@ObfuscatedName("at")
	@Export("fontHelvetica13")
	static java.awt.Font fontHelvetica13;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 2406216224100242295L
	)
	long field117;
	@ObfuscatedName("e")
	String field121;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class13(class2 var1) {
		this.this$0 = var1;
		this.field117 = -1L;
		this.field121 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field117 = var1.readLong();
		}

		this.field121 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method129(this.field117, this.field121);
	}
}
