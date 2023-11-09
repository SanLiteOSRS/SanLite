import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fg")
public class class151 extends class155 {
	@ObfuscatedName("af")
	String field1739;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1153553947
	)
	int field1738;
	@ObfuscatedName("aw")
	byte field1737;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgr;"
	)
	final class156 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgr;)V"
	)
	class151(class156 var1) {
		this.this$0 = var1;
		this.field1739 = null;
	} // L: 59

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Lsg;I)V",
		garbageValue = "-1949352075"
	)
	void vmethod3448(Buffer var1) {
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

		this.field1739 = var1.readStringCp1252NullTerminatedOrNull(); // L: 66
		this.field1738 = var1.readUnsignedShort();
		this.field1737 = var1.readByte();
		var1.readLong();
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Lgj;B)V",
		garbageValue = "-49"
	)
	void vmethod3450(ClanChannel var1) {
		ClanChannelMember var2 = new ClanChannelMember(); // L: 73
		var2.username = new Username(this.field1739);
		var2.world = this.field1738; // L: 75
		var2.rank = this.field1737; // L: 76
		var1.addMember(var2);
	} // L: 78

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(IIII)Lch;",
		garbageValue = "-2068677653"
	)
	@Export("getWorldMapScript")
	static Script getWorldMapScript(int var0, int var1, int var2) {
		int var3 = (var1 << 8) + var0; // L: 40
		Script var5 = ObjectComposition.method4026(var3, var0); // L: 43
		if (var5 != null) { // L: 44
			return var5; // L: 45
		} else {
			int var4 = class262.method5474(var2, var0); // L: 47
			Script var7 = (Script)Script.Script_cached.get((long)(var4 << 16)); // L: 50
			Script var6;
			if (var7 != null) { // L: 51
				var6 = var7; // L: 52
			} else {
				String var8 = String.valueOf(var4); // L: 55
				int var9 = class126.archive12.getGroupId(var8); // L: 56
				if (var9 == -1) { // L: 57
					var6 = null; // L: 58
				} else {
					byte[] var10 = class126.archive12.takeFileFlat(var9); // L: 61
					if (var10 != null) { // L: 62
						if (var10.length <= 1) { // L: 63
							var6 = null; // L: 64
							return var6 != null ? var6 : null; // L: 77 80
						}

						var7 = class33.newScript(var10); // L: 67
						if (var7 != null) { // L: 68
							Script.Script_cached.put(var7, (long)(var4 << 16)); // L: 69
							var6 = var7; // L: 70
							return var6 != null ? var6 : null;
						}
					}

					var6 = null; // L: 74
				}
			}

			return var6 != null ? var6 : null;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(FFFFLek;B)V",
		garbageValue = "98"
	)
	static void method3365(float var0, float var1, float var2, float var3, class125 var4) {
		float var5 = var1 - var0; // L: 339
		float var6 = var2 - var1; // L: 340
		float var7 = var3 - var2; // L: 341
		float var8 = var6 - var5; // L: 342
		var4.field1518 = var7 - var6 - var8; // L: 343
		var4.field1529 = var8 + var8 + var8; // L: 344
		var4.field1516 = var5 + var5 + var5; // L: 345
		var4.field1515 = var0; // L: 346
	} // L: 347

	@ObfuscatedName("nn")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "201113676"
	)
	static final void method3363(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : MouseHandler.guestClanChannel; // L: 12022
		if (var2 != null && var1 >= 0 && var1 < var2.method3416()) { // L: 12023
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12024
			if (var3.rank == -1) {
				String var4 = var3.username.getName(); // L: 12026
				PacketBufferNode var5 = class330.getPacketBufferNode(ClientPacket.field3185, Client.packetWriter.isaacCipher); // L: 12027
				var5.packetBuffer.writeByte(3 + DynamicObject.stringCp1252NullTerminatedByteSize(var4)); // L: 12028
				var5.packetBuffer.writeByte(var0); // L: 12029
				var5.packetBuffer.writeShort(var1); // L: 12030
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12031
				Client.packetWriter.addNode(var5); // L: 12032
			}
		}
	} // L: 12025 12033
}
