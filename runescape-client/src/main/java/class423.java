import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qu")
public class class423 extends class425 {
	@ObfuscatedName("bg")
	@Export("hasFocus")
	protected static boolean hasFocus;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	class333 field4622;
	@ObfuscatedName("aw")
	@ObfuscatedGetter(
		intValue = -1681384595
	)
	int field4621;

	@ObfuscatedSignature(
		descriptor = "(Lqe;IZI)V"
	)
	public class423(class425 var1, int var2, boolean var3, int var4) {
		super(var1); // L: 11
		this.field4622 = null; // L: 7
		this.field4621 = 0; // L: 8
		super.field4627 = "FadeOutTask"; // L: 12
		if (var2 >= 0) { // L: 13
			if (var3 && var2 < class321.field3478.size()) { // L: 16
				this.field4622 = (class333)class321.field3478.get(var2); // L: 17
			} else if (!var3 && var2 < class321.field3474.size()) { // L: 19
				this.field4622 = (class333)class321.field3474.get(var2); // L: 20
			}

			this.field4621 = var4;
		}
	} // L: 14

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2024199564"
	)
	public boolean vmethod8043() {
		if (this.field4622 != null && this.field4622.field3594 != null) {
			this.field4622.field3597 = true;

			try {
				if (this.field4622.field3602 > 0.0F && this.field4622.field3594.isReady()) { // L: 32
					float var1 = this.field4621 == 0 ? (float)this.field4621 : (float)this.field4622.field3592 / (float)this.field4621; // L: 33
					class333 var10000 = this.field4622; // L: 34
					var10000.field3602 -= var1 == 0.0F ? (float)this.field4622.field3592 : var1;
					if (this.field4622.field3602 < 0.0F) { // L: 35
						this.field4622.field3602 = 0.0F; // L: 36
					}

					this.field4622.field3594.setPcmStreamVolume((int)this.field4622.field3602); // L: 38
					return false; // L: 39
				}
			} catch (Exception var3) { // L: 42
				this.method8017(var3.getMessage()); // L: 43
				return true; // L: 44
			}

			this.field4622.field3597 = false; // L: 46
			return true; // L: 47
		} else {
			return true;
		}
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lmn;",
		garbageValue = "0"
	)
	static PacketBufferNode method8005() {
		return PacketBufferNode.PacketBufferNode_packetBufferNodeCount == 0 ? new PacketBufferNode() : PacketBufferNode.PacketBufferNode_packetBufferNodes[--PacketBufferNode.PacketBufferNode_packetBufferNodeCount]; // L: 22 23
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II)Luf;",
		garbageValue = "1884121148"
	)
	public static class526 method8002(int var0) {
		class526 var1 = (class526)class526.DBRowType_cache.get((long)var0); // L: 24
		if (var1 != null) { // L: 25
			return var1;
		} else {
			byte[] var2 = class526.field5151.takeFile(38, var0); // L: 26
			var1 = new class526(); // L: 27
			if (var2 != null) { // L: 28
				var1.method9374(new Buffer(var2));
			}

			var1.method9377(); // L: 29
			class526.DBRowType_cache.put(var1, (long)var0); // L: 30
			return var1; // L: 31
		}
	}
}
