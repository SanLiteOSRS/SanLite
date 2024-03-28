import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("hc")
public class class190 extends DualNode {
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Llt;"
	)
	static EvictingDualNodeHashTable field1974;

	static {
		field1974 = new EvictingDualNodeHashTable(64); // L: 7
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(Loc;II)V",
		garbageValue = "-1022466724"
	)
	public static void method3711(AbstractArchive var0, int var1) {
		if (!class321.field3496.isEmpty()) { // L: 123
			ArrayList var2 = new ArrayList(); // L: 126
			Iterator var3 = class321.field3496.iterator(); // L: 127

			while (var3.hasNext()) {
				class333 var4 = (class333)var3.next(); // L: 128
				var4.field3617 = false; // L: 130
				var4.field3610 = false; // L: 131
				var4.field3604 = false; // L: 132
				var4.field3612 = false; // L: 133
				var4.field3614 = var0; // L: 134
				var4.field3607 = var1; // L: 135
				var4.field3608 = 0.0F; // L: 136
				var2.add(var4); // L: 137
			}

			Renderable.method4881(var2, class321.field3492, class321.field3501, class321.field3502, class321.field3503, false); // L: 140
		}
	} // L: 124 141

	@ObfuscatedName("hj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "27"
	)
	static final void method3709() {
		if (Client.logoutTimer > 0) { // L: 3096
			PacketBufferNode.method5930(); // L: 3097
		} else {
			Client.timer.method7914(); // L: 3100
			FaceNormal.method4886(40); // L: 3101
			Actor.field1277 = Client.packetWriter.getSocket(); // L: 3102
			Client.packetWriter.removeSocket(); // L: 3103
		}
	} // L: 3098 3104
}
