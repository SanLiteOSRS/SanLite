import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("l")
public class class23 extends class14 {
	@ObfuscatedName("c")
	@Export("operatingSystemName")
	public static String operatingSystemName;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 339931933
	)
	int field190;
	@ObfuscatedName("e")
	byte field189;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lv;"
	)
	final class2 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lv;)V"
	)
	class23(class2 var1) {
		this.this$0 = var1;
		this.field190 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnt;I)V",
		garbageValue = "73833784"
	)
	void vmethod363(Buffer var1) {
		this.field190 = var1.readUnsignedShort();
		this.field189 = var1.readByte();
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		descriptor = "(Lb;I)V",
		garbageValue = "1885623446"
	)
	void vmethod354(ClanSettings var1) {
		var1.method131(this.field190, this.field189);
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Ler;",
		garbageValue = "202044265"
	)
	@Export("KitDefinition_get")
	public static KitDefinition KitDefinition_get(int var0) {
		KitDefinition var1 = (KitDefinition)KitDefinition.KitDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = class125.KitDefinition_archive.takeFile(3, var0);
			var1 = new KitDefinition();
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			KitDefinition.KitDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lhl;",
		garbageValue = "-2126823269"
	)
	static LoginPacket[] method318() {
		return new LoginPacket[]{LoginPacket.field2809, LoginPacket.field2804, LoginPacket.field2802, LoginPacket.field2801, LoginPacket.field2806, LoginPacket.field2803};
	}
}
