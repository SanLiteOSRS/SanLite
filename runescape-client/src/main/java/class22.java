import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("n")
public class class22 extends class14 {
	@ObfuscatedName("o")
	static byte[][][] field186;
	@ObfuscatedName("gd")
	@ObfuscatedSignature(
		descriptor = "Loa;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1693043909
	)
	int field182;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class22(class2 var1) {
		this.this$0 = var1;
		this.field182 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field182 = var1.readUnsignedShort();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method127(this.field182);
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "616364541"
	)
	static int method306(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0);
		if (var1 == null) {
			return -1;
		} else {
			return var1.nextDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.nextDual).count;
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/CharSequence;B)Ljava/lang/String;",
		garbageValue = "-39"
	)
	public static String method315(CharSequence var0) {
		int var2 = var0.length();
		char[] var3 = new char[var2];

		for (int var4 = 0; var4 < var2; ++var4) {
			var3[var4] = '*';
		}

		String var1 = new String(var3);
		return var1;
	}

	@ObfuscatedName("ix")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIIB)V",
		garbageValue = "-17"
	)
	@Export("insertMenuItemNoShift")
	public static final void insertMenuItemNoShift(String var0, String var1, int var2, int var3, int var4, int var5) {
		PacketWriter.insertMenuItem(var0, var1, var2, var3, var4, var5, false);
	}

	@ObfuscatedName("jy")
	@ObfuscatedSignature(
		descriptor = "(II)Z",
		garbageValue = "-608958445"
	)
	static boolean method314(int var0) {
		for (int var1 = 0; var1 < Client.field847; ++var1) {
			if (Client.field786[var1] == var0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(Liv;I)I",
		garbageValue = "1053231968"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex);
		return var1 != null ? var1.integer : var0.flags;
	}
}
