import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("c")
public class class13 extends class14 {
	@ObfuscatedName("si")
	@ObfuscatedSignature(
		signature = "Lbl;"
	)
	@Export("friendSystem")
	public static FriendSystem friendSystem;
	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		signature = "[Low;"
	)
	@Export("worldSelectStars")
	static IndexedSprite[] worldSelectStars;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		longValue = 5109296971613093853L
	)
	long field119;
	@ObfuscatedName("o")
	String field116;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lu;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		signature = "(Lu;)V"
	)
	class13(class2 var1) {
		this.this$0 = var1;
		this.field119 = -1L;
		this.field116 = null;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1383981708"
	)
	void vmethod371(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			this.field119 = var1.readLong();
		}

		this.field116 = var1.readStringCp1252NullTerminatedOrNull();
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lm;I)V",
		garbageValue = "-1475503816"
	)
	void vmethod376(class11 var1) {
		var1.method188(this.field119, this.field116);
	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		signature = "(Lhu;I)Lhu;",
		garbageValue = "1854915849"
	)
	static Widget method220(Widget var0) {
		Widget var2 = var0;
		int var3 = AbstractWorldMapData.method3079(DirectByteArrayCopier.getWidgetClickMask(var0));
		Widget var1;
		if (var3 == 0) {
			var1 = null;
		} else {
			int var4 = 0;

			while (true) {
				if (var4 >= var3) {
					var1 = var2;
					break;
				}

				var2 = class139.getWidget(var2.parentId);
				if (var2 == null) {
					var1 = null;
					break;
				}

				++var4;
			}
		}

		Widget var5 = var1;
		if (var1 == null) {
			var5 = var0.parent;
		}

		return var5;
	}
}
