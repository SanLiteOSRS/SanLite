import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fn")
public class class146 {
	@ObfuscatedName("ol")
	@ObfuscatedSignature(
		descriptor = "Lmi;"
	)
	@Export("mousedOverWidgetIf1")
	static Widget mousedOverWidgetIf1;
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		longValue = 6751235396742420937L
	)
	long field1690;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = 128058307
	)
	public int field1682;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	IterableNodeDeque field1683;

	@ObfuscatedSignature(
		descriptor = "(Ltm;)V"
	)
	public class146(Buffer var1) {
		this.field1682 = -1; // L: 9
		this.field1683 = new IterableNodeDeque(); // L: 10
		this.method3130(var1); // L: 28
	} // L: 29

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ltm;B)V",
		garbageValue = "-82"
	)
	void method3130(Buffer var1) {
		this.field1690 = var1.readLong(); // L: 32
		this.field1682 = var1.readInt(); // L: 33

		for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) { // L: 34 35 55
			Object var3;
			if (var2 == 3) { // L: 37
				var3 = new class165(this);
			} else if (var2 == 1) { // L: 38
				var3 = new class141(this);
			} else if (var2 == 13) { // L: 39
				var3 = new class158(this);
			} else if (var2 == 4) { // L: 40
				var3 = new class150(this);
			} else if (var2 == 6) { // L: 41
				var3 = new class157(this);
			} else if (var2 == 5) { // L: 42
				var3 = new class142(this);
			} else if (var2 == 2) { // L: 43
				var3 = new class147(this);
			} else if (var2 == 7) { // L: 44
				var3 = new class140(this);
			} else if (var2 == 14) { // L: 45
				var3 = new class144(this);
			} else if (var2 == 8) { // L: 46
				var3 = new class161(this);
			} else if (var2 == 9) { // L: 47
				var3 = new class167(this);
			} else if (var2 == 10) {
				var3 = new class153(this); // L: 48
			} else if (var2 == 11) { // L: 49
				var3 = new class148(this);
			} else if (var2 == 12) { // L: 50
				var3 = new class152(this);
			} else {
				if (var2 != 15) { // L: 51
					throw new RuntimeException(""); // L: 52
				}

				var3 = new class162(this);
			}

			((class143)var3).vmethod3337(var1); // L: 53
			this.field1683.addFirst((Node)var3); // L: 54
		}

	} // L: 57

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Lfi;I)V",
		garbageValue = "192399010"
	)
	public void method3124(ClanSettings var1) {
		if (var1.field1728 == this.field1690 && this.field1682 == var1.field1745) { // L: 60
			for (class143 var2 = (class143)this.field1683.last(); var2 != null; var2 = (class143)this.field1683.previous()) { // L: 61
				var2.vmethod3339(var1); // L: 62
			}

			++var1.field1745; // L: 64
		} else {
			throw new RuntimeException("");
		}
	} // L: 65

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(B)Lly;",
		garbageValue = "-1"
	)
	public static PacketBufferNode method3131() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}
}
