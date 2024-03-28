import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qh")
public class class425 extends class426 {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Lml;"
	)
	class333 field4648;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = -773370011
	)
	int field4647;

	@ObfuscatedSignature(
		descriptor = "(Lqc;IZI)V"
	)
	public class425(class426 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4648 = null; // L: 7
		this.field4647 = 0; // L: 8
		super.field4651 = "FadeInTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class321.field3500.size()) { // L: 16
				this.field4648 = (class333)class321.field3500.get(var2); // L: 17
			} else if (!var3 && var2 < class321.field3495.size()) { // L: 19
				this.field4648 = (class333)class321.field3495.get(var2); // L: 20
			}

			this.field4647 = var4; // L: 22
		}
	} // L: 23

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4648 != null && this.field4648.field3613 != null) {
			this.field4648.field3604 = true;

			try {
				if (this.field4648.field3608 < (float)this.field4648.field3607 && this.field4648.field3613.isReady()) {
					float var1 = this.field4647 == 0 ? (float)this.field4647 : (float)this.field4648.field3607 / (float)this.field4647;
					class333 var10000 = this.field4648;
					var10000.field3608 += 0.0F == var1 ? (float)this.field4648.field3607 : var1;
					if (this.field4648.field3608 > (float)this.field4648.field3607) {
						this.field4648.field3608 = (float)this.field4648.field3607;
					}

					this.field4648.field3613.setPcmStreamVolume((int)this.field4648.field3608);
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method7844(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4648.field3604 = false; // L: 46
			return true; // L: 47
		} else {
			return true;
		}
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "12"
	)
	public static void method7823() {
		class195.field2000.clear(); // L: 14
	} // L: 15

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Llw;Lvb;B)Lmh;",
		garbageValue = "-76"
	)
	@Export("getPacketBufferNode")
	public static PacketBufferNode getPacketBufferNode(ClientPacket var0, IsaacCipher var1) {
		PacketBufferNode var2 = WorldMapSection0.method5639(); // L: 27
		var2.clientPacket = var0; // L: 28
		var2.clientPacketLength = var0.length; // L: 29
		if (var2.clientPacketLength == -1) { // L: 30
			var2.packetBuffer = new PacketBuffer(260);
		} else if (var2.clientPacketLength == -2) {
			var2.packetBuffer = new PacketBuffer(10000); // L: 31
		} else if (var2.clientPacketLength <= 18) { // L: 32
			var2.packetBuffer = new PacketBuffer(20);
		} else if (var2.clientPacketLength <= 98) { // L: 33
			var2.packetBuffer = new PacketBuffer(100);
		} else {
			var2.packetBuffer = new PacketBuffer(260); // L: 34
		}

		var2.packetBuffer.setIsaacCipher(var1); // L: 35
		var2.packetBuffer.writeByteIsaac(var2.clientPacket.id); // L: 36
		var2.index = 0; // L: 37
		return var2; // L: 38
	}
}
