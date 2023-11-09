import java.util.Iterator;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eh")
public class class124 implements Callable {
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "Lon;"
	)
	@Export("ItemComposition_fontPlain11")
	public static Font ItemComposition_fontPlain11;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lek;"
	)
	final class125 field1503;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Ley;"
	)
	final class126 field1500;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lec;"
	)
	final class127 field1505;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = 2042451507
	)
	final int field1502;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lfh;"
	)
	final class133 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lfh;Lek;Ley;Lec;I)V"
	)
	class124(class133 var1, class125 var2, class126 var3, class127 var4, int var5) {
		this.this$0 = var1; // L: 296
		this.field1503 = var2; // L: 297
		this.field1500 = var3; // L: 298
		this.field1505 = var4; // L: 299
		this.field1502 = var5; // L: 300
	} // L: 301

	public Object call() {
		this.field1503.method3083(); // L: 305
		class125[][] var1;
		if (this.field1500 == class126.field1532) { // L: 307
			var1 = this.this$0.field1589; // L: 308
		} else {
			var1 = this.this$0.field1592; // L: 311
		}

		var1[this.field1502][this.field1505.method3105()] = this.field1503; // L: 313
		return null; // L: 314
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1442694367"
	)
	static void method3057() {
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_lock) { // L: 42
			if (ArchiveDiskActionHandler.field4196 == 0) { // L: 43
				GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread = new Thread(new ArchiveDiskActionHandler()); // L: 44
				GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.setDaemon(true); // L: 45
				GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.start(); // L: 46
				GrandExchangeOfferNameComparator.ArchiveDiskActionHandler_thread.setPriority(5); // L: 47
			}

			ArchiveDiskActionHandler.field4196 = 600; // L: 49
		}
	} // L: 51

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "49"
	)
	static void method3058() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 70

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 71
			var1.clearIsFromIgnored(); // L: 73
		}

	} // L: 76
}
