import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ga")
public class class167 extends class160 {
	@ObfuscatedName("fb")
	@ObfuscatedSignature(
		descriptor = "Lro;"
	)
	@Export("js5Socket")
	static AbstractSocket js5Socket;
	@ObfuscatedName("at")
	String field1785;
	@ObfuscatedName("ah")
	byte field1781;
	@ObfuscatedName("ar")
	byte field1782;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lgi;"
	)
	final class161 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lgi;)V"
	)
	class167(class161 var1) {
		this.this$0 = var1; // L: 157
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Luj;I)V",
		garbageValue = "1810249387"
	)
	void vmethod3497(Buffer var1) {
		this.field1785 = var1.readStringCp1252NullTerminatedOrNull(); // L: 160
		if (this.field1785 != null) { // L: 161
			var1.readUnsignedByte(); // L: 162
			this.field1781 = var1.readByte(); // L: 163
			this.field1782 = var1.readByte(); // L: 164
		}

	} // L: 166

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Lgn;B)V",
		garbageValue = "-75"
	)
	void vmethod3501(ClanChannel var1) {
		var1.name = this.field1785; // L: 169
		if (this.field1785 != null) { // L: 170
			var1.field1766 = this.field1781; // L: 171
			var1.field1771 = this.field1782; // L: 172
		}

	} // L: 174

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/String;",
		garbageValue = "-1882833719"
	)
	@Export("colorStartTag")
	static String colorStartTag(int var0) {
		return "<col=" + Integer.toHexString(var0) + ">"; // L: 22
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IIIIB)I",
		garbageValue = "21"
	)
	static final int method3503(int var0, int var1, int var2, int var3) {
		return var3 * var0 + var2 * var1 >> 16; // L: 17
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-139333947"
	)
	@Export("getGcDuration")
	protected static int getGcDuration() {
		int var0 = 0; // L: 632
		if (UserComparator10.garbageCollector == null || !UserComparator10.garbageCollector.isValid()) { // L: 633
			try {
				Iterator var1 = ManagementFactory.getGarbageCollectorMXBeans().iterator(); // L: 635

				while (var1.hasNext()) {
					GarbageCollectorMXBean var2 = (GarbageCollectorMXBean)var1.next(); // L: 636
					if (var2.isValid()) { // L: 638
						UserComparator10.garbageCollector = var2; // L: 639
						GameEngine.garbageCollectorLastCheckTimeMs = -1L; // L: 640
						GameEngine.garbageCollectorLastCollectionTime = -1L; // L: 641
					}
				}
			} catch (Throwable var11) { // L: 646
			}
		}

		if (UserComparator10.garbageCollector != null) { // L: 648
			long var9 = SpotAnimationDefinition.method3775(); // L: 649
			long var3 = UserComparator10.garbageCollector.getCollectionTime(); // L: 650
			if (-1L != GameEngine.garbageCollectorLastCollectionTime) { // L: 651
				long var5 = var3 - GameEngine.garbageCollectorLastCollectionTime; // L: 652
				long var7 = var9 - GameEngine.garbageCollectorLastCheckTimeMs; // L: 653
				if (var7 != 0L) { // L: 654
					var0 = (int)(var5 * 100L / var7);
				}
			}

			GameEngine.garbageCollectorLastCollectionTime = var3; // L: 656
			GameEngine.garbageCollectorLastCheckTimeMs = var9; // L: 657
		}

		return var0; // L: 659
	}
}
