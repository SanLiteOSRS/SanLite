import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
public class class7 {
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1299157837
	)
	static int field25;
	@ObfuscatedName("au")
	ExecutorService field21;
	@ObfuscatedName("ae")
	Future field26;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Ltm;"
	)
	final Buffer field22;
	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "Lat;"
	)
	final class3 field20;

	@ObfuscatedSignature(
		descriptor = "(Ltm;Lat;)V"
	)
	public class7(Buffer var1, class3 var2) {
		this.field21 = Executors.newSingleThreadExecutor(); // L: 10
		this.field22 = var1; // L: 16
		this.field20 = var2; // L: 17
		this.method40(); // L: 18
	} // L: 19

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1836441256"
	)
	public boolean method42() {
		return this.field26.isDone(); // L: 22
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "2092027940"
	)
	public void method39() {
		this.field21.shutdown(); // L: 26
		this.field21 = null; // L: 27
	} // L: 28

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)Ltm;",
		garbageValue = "-120"
	)
	public Buffer method41() {
		try {
			return (Buffer)this.field26.get(); // L: 32
		} catch (Exception var2) { // L: 34
			return null; // L: 35
		}
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-691162885"
	)
	void method40() {
		this.field26 = this.field21.submit(new class1(this, this.field22, this.field20)); // L: 40
	} // L: 41

	@ObfuscatedName("iy")
	@ObfuscatedSignature(
		descriptor = "(IB)I",
		garbageValue = "1"
	)
	static final int method53(int var0) {
		return Math.abs(var0 - UserComparator10.cameraYaw) > 1024 ? var0 + 2048 * (var0 < UserComparator10.cameraYaw ? 1 : -1) : var0; // L: 3773 3774
	}
}
