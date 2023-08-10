import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fk")
public class class150 extends class143 {
	@ObfuscatedName("vx")
	@ObfuscatedSignature(
		descriptor = "Lda;"
	)
	@Export("clientPreferences")
	static ClientPreferences clientPreferences;
	@ObfuscatedName("aw")
	boolean field1686;
	@ObfuscatedName("ay")
	byte field1684;
	@ObfuscatedName("ar")
	byte field1683;
	@ObfuscatedName("am")
	byte field1687;
	@ObfuscatedName("as")
	byte field1689;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfr;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfr;)V"
	)
	class150(class146 var1) {
		this.this$0 = var1; // L: 248
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Lty;B)V",
		garbageValue = "1"
	)
	void vmethod3412(Buffer var1) {
		this.field1686 = var1.readUnsignedByte() == 1; // L: 251
		this.field1684 = var1.readByte(); // L: 252
		this.field1683 = var1.readByte(); // L: 253
		this.field1687 = var1.readByte(); // L: 254
		this.field1689 = var1.readByte(); // L: 255
	} // L: 256

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Lfx;B)V",
		garbageValue = "-72"
	)
	void vmethod3419(ClanSettings var1) {
		var1.allowGuests = this.field1686; // L: 259
		var1.field1712 = this.field1684; // L: 260
		var1.field1706 = this.field1683; // L: 261
		var1.field1713 = this.field1687; // L: 262
		var1.field1714 = this.field1689; // L: 263
	} // L: 264

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/Object;ZB)[B",
		garbageValue = "75"
	)
	public static byte[] method3189(Object var0, boolean var1) {
		if (var0 == null) { // L: 30
			return null;
		} else if (var0 instanceof byte[]) { // L: 31
			byte[] var6 = (byte[])((byte[])var0); // L: 32
			if (var1) { // L: 33
				int var4 = var6.length; // L: 36
				byte[] var5 = new byte[var4]; // L: 37
				System.arraycopy(var6, 0, var5, 0, var4); // L: 38
				return var5; // L: 41
			} else {
				return var6; // L: 43
			}
		} else if (var0 instanceof AbstractByteArrayCopier) { // L: 45
			AbstractByteArrayCopier var2 = (AbstractByteArrayCopier)var0; // L: 46
			return var2.get(); // L: 47
		} else {
			throw new IllegalArgumentException(); // L: 49
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IIIZIZS)V",
		garbageValue = "-25741"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) { // L: 178
			int var6 = (var0 + var1) / 2; // L: 179
			int var7 = var0; // L: 180
			World var8 = class387.World_worlds[var6]; // L: 181
			class387.World_worlds[var6] = class387.World_worlds[var1]; // L: 182
			class387.World_worlds[var1] = var8; // L: 183

			for (int var9 = var0; var9 < var1; ++var9) { // L: 184
				World var11 = class387.World_worlds[var9]; // L: 186
				int var12 = ClanSettings.compareWorlds(var11, var8, var2, var3); // L: 188
				int var10;
				if (var12 != 0) { // L: 189
					if (var3) { // L: 190
						var10 = -var12; // L: 191
					} else {
						var10 = var12; // L: 195
					}
				} else if (var4 == -1) { // L: 199
					var10 = 0; // L: 200
				} else {
					int var13 = ClanSettings.compareWorlds(var11, var8, var4, var5); // L: 203
					if (var5) { // L: 204
						var10 = -var13;
					} else {
						var10 = var13; // L: 205
					}
				}

				if (var10 <= 0) { // L: 207
					World var14 = class387.World_worlds[var9]; // L: 208
					class387.World_worlds[var9] = class387.World_worlds[var7]; // L: 209
					class387.World_worlds[var7++] = var14; // L: 210
				}
			}

			class387.World_worlds[var1] = class387.World_worlds[var7]; // L: 214
			class387.World_worlds[var7] = var8; // L: 215
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5); // L: 216
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5); // L: 217
		}

	} // L: 219

	@ObfuscatedName("nm")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2003552288"
	)
	static final void method3196(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12694
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3383()) { // L: 12695
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12696
				PacketBufferNode var4 = class503.getPacketBufferNode(ClientPacket.field3139, Client.packetWriter.isaacCipher); // L: 12697
				var4.packetBuffer.writeByte(4 + class501.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12698
				var4.packetBuffer.writeByte(var0); // L: 12699
				var4.packetBuffer.writeShort(var1); // L: 12700
				var4.packetBuffer.writeBoolean(var2); // L: 12701
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12702
				Client.packetWriter.addNode(var4); // L: 12703
			}
		}
	} // L: 12704
}
