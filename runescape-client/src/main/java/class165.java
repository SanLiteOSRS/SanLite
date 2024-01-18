import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gv")
public class class165 extends class143 {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = -8063989231043793109L
	)
	long field1780;
	@ObfuscatedName("ap")
	String field1776;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfm;"
	)
	final class146 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfm;)V"
	)
	class165(class146 var1) {
		this.this$0 = var1;
		this.field1780 = -1L; // L: 194
		this.field1776 = null; // L: 195
	} // L: 197

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-411371469"
	)
	void vmethod3531(Buffer var1) {
		if (var1.readUnsignedByte() != 255) { // L: 200
			--var1.offset; // L: 201
			this.field1780 = var1.readLong(); // L: 202
		}

		this.field1776 = var1.readStringCp1252NullTerminatedOrNull(); // L: 204
	} // L: 205

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(Lfn;I)V",
		garbageValue = "1048713263"
	)
	void vmethod3529(ClanSettings var1) {
		var1.method3347(this.field1780, this.field1776); // L: 208
	} // L: 209

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II)Lky;",
		garbageValue = "-1613158274"
	)
	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = (Frames)SequenceDefinition.SequenceDefinition_cachedFrames.get((long)var0); // L: 372
		if (var1 != null) { // L: 373
			return var1;
		} else {
			var1 = class226.method4463(SequenceDefinition.SequenceDefinition_animationsArchive, class332.SequenceDefinition_skeletonsArchive, var0, false); // L: 374
			if (var1 != null) { // L: 375
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, (long)var0);
			}

			return var1; // L: 376
		}
	}

	@ObfuscatedName("kf")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-35"
	)
	static final void method3516(int var0, int var1, int var2, int var3) {
		class410.method7742(); // L: 5729
	} // L: 5730

	@ObfuscatedName("kx")
	@ObfuscatedSignature(
		descriptor = "(Ldf;II)V",
		garbageValue = "-434342130"
	)
	static final void method3517(Actor var0, int var1) {
		FriendSystem.worldToScreen(var0.x, var0.y, var1); // L: 5733
	} // L: 5734

	@ObfuscatedName("nd")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1895306323"
	)
	static final void method3515(int var0) {
		var0 = Math.min(Math.max(var0, 0), 127); // L: 12160
		class93.clientPreferences.method2539(var0); // L: 12161
	} // L: 12162

	@ObfuscatedName("ou")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1722840458"
	)
	@Export("clanKickUser")
	static final void clanKickUser(String var0) {
		if (ClientPreferences.friendsChatManager != null) { // L: 12476
			PacketBufferNode var1 = class482.getPacketBufferNode(ClientPacket.field3219, Client.packetWriter.isaacCipher); // L: 12477
			var1.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var0)); // L: 12478
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12479
			Client.packetWriter.addNode(var1); // L: 12480
		}
	} // L: 12481
}
