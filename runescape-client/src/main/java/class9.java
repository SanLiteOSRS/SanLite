import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class9 implements class387 {
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final class9 field21;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	public static final class9 field19;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class9 field20;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class9 field18;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Laa;"
	)
	static final class9 field28;
	@ObfuscatedName("bi")
	@Export("garbageCollector")
	static GarbageCollectorMXBean garbageCollector;
	@ObfuscatedName("ua")
	@ObfuscatedGetter(
		intValue = -1484275712
	)
	static int field29;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 1539111659
	)
	int field22;
	@ObfuscatedName("ag")
	String field24;
	@ObfuscatedName("ao")
	boolean field25;
	@ObfuscatedName("ae")
	boolean field26;

	static {
		field21 = new class9(0, "POST", true, true); // L: 6
		field19 = new class9(1, "GET", true, false); // L: 7
		field20 = new class9(2, "PUT", false, true); // L: 8
		field18 = new class9(3, "PATCH", false, true); // L: 9
		field28 = new class9(4, "DELETE", false, true); // L: 10
	}

	class9(int var1, String var2, boolean var3, boolean var4) {
		this.field22 = var1; // L: 17
		this.field24 = var2; // L: 18
		this.field25 = var3; // L: 19
		this.field26 = var4; // L: 20
	} // L: 21

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "1549455343"
	)
	boolean method64() {
		return this.field25; // L: 24
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-884190501"
	)
	@Export("rsOrdinal")
	public int rsOrdinal() {
		return this.field22; // L: 37
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(B)Ljava/lang/String;",
		garbageValue = "-12"
	)
	public String method65() {
		return this.field24; // L: 28
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1715077183"
	)
	boolean method63() {
		return this.field26; // L: 32
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(IB)Lhl;",
		garbageValue = "15"
	)
	@Export("SequenceDefinition_get")
	public static SequenceDefinition SequenceDefinition_get(int var0) {
		SequenceDefinition var1 = (SequenceDefinition)SequenceDefinition.SequenceDefinition_cached.get((long)var0); // L: 57
		if (var1 != null) { // L: 58
			return var1; // L: 59
		} else {
			byte[] var2 = SequenceDefinition.SequenceDefinition_archive.takeFile(12, var0); // L: 61
			var1 = new SequenceDefinition(); // L: 62
			if (var2 != null) { // L: 63
				var1.decode(new Buffer(var2)); // L: 64
			}

			var1.postDecode(); // L: 66
			SequenceDefinition.SequenceDefinition_cached.put(var1, (long)var0); // L: 67
			return var1; // L: 68
		}
	}

	@ObfuscatedName("ib")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-781544794"
	)
	static final void method79() {
		if (class113.Client_plane != Client.field732) { // L: 3941
			Client.field732 = class113.Client_plane; // L: 3942
			class102.method2738(class113.Client_plane); // L: 3943
		}

	} // L: 3945

	@ObfuscatedName("op")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-888075873"
	)
	@Export("Clan_joinChat")
	static final void Clan_joinChat(String var0) {
		if (!var0.equals("")) { // L: 12484
			PacketBufferNode var1 = class482.getPacketBufferNode(ClientPacket.field3217, Client.packetWriter.isaacCipher); // L: 12486
			var1.packetBuffer.writeByte(CollisionMap.stringCp1252NullTerminatedByteSize(var0)); // L: 12487
			var1.packetBuffer.writeStringCp1252NullTerminated(var0); // L: 12488
			Client.packetWriter.addNode(var1); // L: 12489
		}
	} // L: 12490

	@ObfuscatedName("oo")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "2023850938"
	)
	static final void method69(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12527
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3492()) { // L: 12528
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12529
				PacketBufferNode var4 = class482.getPacketBufferNode(ClientPacket.field3231, Client.packetWriter.isaacCipher); // L: 12530
				var4.packetBuffer.writeByte(4 + CollisionMap.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12531
				var4.packetBuffer.writeByte(var0); // L: 12532
				var4.packetBuffer.writeShort(var1); // L: 12533
				var4.packetBuffer.writeBoolean(var2); // L: 12534
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12535
				Client.packetWriter.addNode(var4); // L: 12536
			}
		}
	} // L: 12537
}
