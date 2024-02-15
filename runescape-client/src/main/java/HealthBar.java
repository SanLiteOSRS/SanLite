import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("db")
@Implements("HealthBar")
public class HealthBar extends Node {
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lgx;"
	)
	@Export("definition")
	HealthBarDefinition definition;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lpo;"
	)
	@Export("updates")
	IterableNodeDeque updates;

	@ObfuscatedSignature(
		descriptor = "(Lgx;)V"
	)
	HealthBar(HealthBarDefinition var1) {
		this.updates = new IterableNodeDeque(); // L: 12
		this.definition = var1; // L: 15
	} // L: 16

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)V",
		garbageValue = "-14"
	)
	@Export("put")
	void put(int var1, int var2, int var3, int var4) {
		HealthBarUpdate var5 = null; // L: 19
		int var6 = 0; // L: 20

		for (HealthBarUpdate var7 = (HealthBarUpdate)this.updates.last(); var7 != null; var7 = (HealthBarUpdate)this.updates.previous()) { // L: 21
			++var6; // L: 22
			if (var7.cycle == var1) { // L: 23
				var7.set(var1, var2, var3, var4); // L: 24
				return; // L: 25
			}

			if (var7.cycle <= var1) {
				var5 = var7; // L: 27
			}
		}

		if (var5 == null) { // L: 29
			if (var6 < 4) { // L: 30
				this.updates.addLast(new HealthBarUpdate(var1, var2, var3, var4));
			}

		} else {
			IterableNodeDeque.IterableNodeDeque_addBefore(new HealthBarUpdate(var1, var2, var3, var4), var5); // L: 33
			if (var6 >= 4) {
				this.updates.last().remove(); // L: 34
			}

		}
	} // L: 31 35

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Ldp;",
		garbageValue = "897585632"
	)
	@Export("get")
	HealthBarUpdate get(int var1) {
		HealthBarUpdate var2 = (HealthBarUpdate)this.updates.last(); // L: 38
		if (var2 != null && var2.cycle <= var1) { // L: 39
			for (HealthBarUpdate var3 = (HealthBarUpdate)this.updates.previous(); var3 != null && var3.cycle <= var1; var3 = (HealthBarUpdate)this.updates.previous()) { // L: 40 41
				var2.remove(); // L: 42
				var2 = var3; // L: 43
			}

			if (this.definition.int5 + var2.cycleOffset + var2.cycle > var1) { // L: 47
				return var2;
			} else {
				var2.remove(); // L: 49
				return null; // L: 50
			}
		} else {
			return null;
		}
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "693539626"
	)
	@Export("isEmpty")
	boolean isEmpty() {
		return this.updates.method7456(); // L: 55
	}

	@ObfuscatedName("ny")
	@ObfuscatedSignature(
		descriptor = "(IIZI)V",
		garbageValue = "1444876368"
	)
	static final void method2653(int var0, int var1, boolean var2) {
		if (Client.currentClanChannels[var0] != null) { // L: 12753
			if (var1 >= 0 && var1 < Client.currentClanChannels[var0].method3481()) { // L: 12754
				ClanChannelMember var3 = (ClanChannelMember)Client.currentClanChannels[var0].members.get(var1); // L: 12755
				PacketBufferNode var4 = ViewportMouse.getPacketBufferNode(ClientPacket.field3183, Client.packetWriter.isaacCipher); // L: 12756
				var4.packetBuffer.writeByte(4 + class145.stringCp1252NullTerminatedByteSize(var3.username.getName())); // L: 12757
				var4.packetBuffer.writeByte(var0); // L: 12758
				var4.packetBuffer.writeShort(var1); // L: 12759
				var4.packetBuffer.writeBoolean(var2); // L: 12760
				var4.packetBuffer.writeStringCp1252NullTerminated(var3.username.getName()); // L: 12761
				Client.packetWriter.addNode(var4); // L: 12762
			}
		}
	} // L: 12763
}
