import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("kp")
@Implements("Coord")
public class Coord {
	@ObfuscatedName("ne")
	@ObfuscatedGetter(
		intValue = 1208888331
	)
	@Export("selectedSpellFlags")
	static int selectedSpellFlags;
	@ObfuscatedName("o")
	@ObfuscatedGetter(
		intValue = 1220578687
	)
	@Export("plane")
	public int plane;
	@ObfuscatedName("q")
	@ObfuscatedGetter(
		intValue = -1712596677
	)
	@Export("x")
	public int x;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = -1113097037
	)
	@Export("y")
	public int y;

	@ObfuscatedSignature(
		descriptor = "(Lkp;)V"
	)
	public Coord(Coord var1) {
		this.plane = var1.plane; // L: 15
		this.x = var1.x; // L: 16
		this.y = var1.y; // L: 17
	} // L: 18

	public Coord(int var1, int var2, int var3) {
		this.plane = var1; // L: 9
		this.x = var2; // L: 10
		this.y = var3; // L: 11
	} // L: 12

	public Coord(int var1) {
		if (var1 == -1) { // L: 21
			this.plane = -1;
		} else {
			this.plane = var1 >> 28 & 3; // L: 23
			this.x = var1 >> 14 & 16383; // L: 24
			this.y = var1 & 16383; // L: 25
		}

	} // L: 27

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "62533759"
	)
	@Export("packed")
	public int packed() {
		int var2 = this.plane; // L: 31
		int var3 = this.x; // L: 32
		int var4 = this.y; // L: 33
		int var1 = var2 << 28 | var3 << 14 | var4; // L: 35
		return var1; // L: 37
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(Lkp;I)Z",
		garbageValue = "1957084070"
	)
	@Export("equalsCoord")
	boolean equalsCoord(Coord var1) {
		if (this.plane != var1.plane) { // L: 48
			return false;
		} else if (this.x != var1.x) { // L: 49
			return false;
		} else {
			return this.y == var1.y; // L: 50
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)Ljava/lang/String;",
		garbageValue = "37"
	)
	@Export("toString")
	String toString(String var1) {
		return this.plane + var1 + (this.x >> 6) + var1 + (this.y >> 6) + var1 + (this.x & 63) + var1 + (this.y & 63); // L: 64
	}

	public String toString() {
		return this.toString(","); // L: 60
	}

	public boolean equals(Object var1) {
		if (this == var1) { // L: 42
			return true;
		} else {
			return !(var1 instanceof Coord) ? false : this.equalsCoord((Coord)var1); // L: 43 44
		}
	}

	public int hashCode() {
		return this.packed(); // L: 56
	}

	@ObfuscatedName("lf")
	@ObfuscatedSignature(
		descriptor = "(IIZB)V",
		garbageValue = "-72"
	)
	static final void method5543(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12249
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3117()) { // L: 12250
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12251
				PacketBufferNode var4 = class433.getPacketBufferNode(ClientPacket.field3017, Client.packetWriter.isaacCipher); // L: 12252
				var4.packetBuffer.writeByte(4 + class92.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12253
				var4.packetBuffer.writeByte(var0); // L: 12254
				var4.packetBuffer.writeShort(var1); // L: 12255
				var4.packetBuffer.writeBoolean(var2); // L: 12256
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12257
				Client.packetWriter.addNode(var4); // L: 12258
			}
		}
	} // L: 12259
}
