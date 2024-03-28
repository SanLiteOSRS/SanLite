import java.util.ArrayList;
import java.util.Iterator;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("qp")
public class class421 extends class426 {
	@ObfuscatedName("az")
	ArrayList field4638;

	@ObfuscatedSignature(
		descriptor = "(Lqc;Ljava/util/ArrayList;)V"
	)
	public class421(class426 var1, ArrayList var2) {
		super(var1); // L: 12
		super.field4651 = "ClearRequestTask"; // L: 13
		this.field4638 = var2; // L: 14
	} // L: 15

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-362428891"
	)
	public boolean vmethod7854() {
		if (this.field4638.isEmpty()) { // L: 19
			return true; // L: 20
		} else {
			Iterator var1 = this.field4638.iterator(); // L: 22

			while (var1.hasNext()) {
				class333 var2 = (class333)var1.next(); // L: 23

				try {
					if (class321.field3495.contains(var2)) { // L: 26
						if (var2 == null) { // L: 27
							class321.field3495.remove(var2); // L: 28
						} else {
							if (var2.field3613.field3534 > 0) { // L: 31
								--var2.field3613.field3534; // L: 32
							}

							if (var2.field3613.field3534 == 0) { // L: 34
								var2.field3613.clear(); // L: 35
								var2.field3613.method6004(); // L: 36
								var2.field3613.setPcmStreamVolume(0); // L: 37
							}

							int var3 = var2.field3605; // L: 39
							int var4 = var2.field3606; // L: 40
							Iterator var5 = class321.field3499.iterator(); // L: 42

							while (var5.hasNext()) {
								class327 var6 = (class327)var5.next(); // L: 43
								var6.vmethod6187(var3, var4); // L: 45
							}

							class321.field3495.remove(var2); // L: 49
						}
					}
				} catch (Exception var8) { // L: 52
					class180.RunException_sendStackTrace((String)null, var8); // L: 53
					this.method7844(var8.getMessage()); // L: 54
					class321.field3495.clear(); // L: 55
					return true; // L: 56
				}
			}

			return true; // L: 60
		}
	}

	@ObfuscatedName("hy")
	@ObfuscatedSignature(
		descriptor = "(I)J",
		garbageValue = "-1042075836"
	)
	static long method7807() {
		return Client.field639; // L: 2978
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-89"
	)
	static final void method7808() {
		for (GraphicsObject var0 = (GraphicsObject)Client.graphicsObjects.last(); var0 != null; var0 = (GraphicsObject)Client.graphicsObjects.previous()) { // L: 5082 5083 5090
			if (var0.plane == class172.Client_plane && !var0.isFinished) { // L: 5084
				if (Client.cycle >= var0.cycleStart) { // L: 5085
					var0.advance(Client.field545); // L: 5086
					if (var0.isFinished) { // L: 5087
						var0.remove();
					} else {
						LoginType.scene.drawEntity(var0.plane, var0.x, var0.y, var0.z, 60, var0, 0, -1L, false); // L: 5088
					}
				}
			} else {
				var0.remove();
			}
		}

	} // L: 5092
}
