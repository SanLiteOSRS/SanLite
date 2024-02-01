import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ql")
@Implements("Timer")
public class Timer {
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		longValue = 8123457496918475819L
	)
	long field4637;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		longValue = 2411057472353556645L
	)
	long field4632;
	@ObfuscatedName("af")
	public boolean field4633;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = -9158225852530299609L
	)
	long field4634;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		longValue = 3716441261964006791L
	)
	long field4631;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		longValue = 1681938412376190251L
	)
	long field4636;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = 868254961
	)
	int field4640;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = 659823223
	)
	int field4635;
	@ObfuscatedName("ae")
	@ObfuscatedGetter(
		intValue = -1269489301
	)
	int field4639;
	@ObfuscatedName("aa")
	@ObfuscatedGetter(
		intValue = -3966963
	)
	int field4641;

	public Timer() {
		this.field4637 = -1L; // L: 7
		this.field4632 = -1L; // L: 8
		this.field4633 = false; // L: 9
		this.field4634 = 0L; // L: 10
		this.field4631 = 0L; // L: 11
		this.field4636 = 0L; // L: 12
		this.field4640 = 0; // L: 13
		this.field4635 = 0; // L: 14
		this.field4639 = 0; // L: 15
		this.field4641 = 0; // L: 16
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-21283"
	)
	public void method8044() {
		this.field4637 = UserComparator9.method2973(); // L: 19
	} // L: 20

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2083224949"
	)
	public void method8040() {
		if (-1L != this.field4637) {
			this.field4631 = UserComparator9.method2973() - this.field4637;
			this.field4637 = -1L;
		}

	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1695662894"
	)
	public void method8041(int var1) {
		this.field4632 = UserComparator9.method2973(); // L: 30
		this.field4640 = var1; // L: 31
	} // L: 32

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "983948841"
	)
	public void method8042() {
		if (this.field4632 != -1L) { // L: 35
			this.field4634 = UserComparator9.method2973() - this.field4632; // L: 36
			this.field4632 = -1L; // L: 37
		}

		++this.field4639; // L: 39
		this.field4633 = true; // L: 40
	} // L: 41

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1853612242"
	)
	public void method8043() {
		this.field4633 = false; // L: 44
		this.field4635 = 0; // L: 45
	} // L: 46

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3120"
	)
	public void method8038() {
		this.method8042(); // L: 49
	} // L: 50

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(Luk;I)V",
		garbageValue = "-1256777436"
	)
	@Export("write")
	public void write(Buffer var1) {
		long var2 = this.field4631; // L: 53
		var2 /= 10L; // L: 55
		if (var2 < 0L) { // L: 56
			var2 = 0L;
		} else if (var2 > 65535L) { // L: 57
			var2 = 65535L;
		}

		var1.writeShort((int)var2); // L: 58
		long var4 = this.field4634; // L: 60
		var4 /= 10L; // L: 62
		if (var4 < 0L) { // L: 63
			var4 = 0L;
		} else if (var4 > 65535L) { // L: 64
			var4 = 65535L;
		}

		var1.writeShort((int)var4); // L: 65
		long var6 = this.field4636; // L: 67
		var6 /= 10L; // L: 69
		if (var6 < 0L) { // L: 70
			var6 = 0L;
		} else if (var6 > 65535L) { // L: 71
			var6 = 65535L;
		}

		var1.writeShort((int)var6); // L: 72
		var1.writeShort(this.field4640); // L: 74
		var1.writeShort(this.field4635); // L: 75
		var1.writeShort(this.field4639); // L: 76
		var1.writeShort(this.field4641); // L: 77
	} // L: 78

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "20"
	)
	public static void method8056() {
		while (true) {
			ArchiveDiskAction var0;
			synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) { // L: 23
				var0 = (ArchiveDiskAction)ArchiveDiskActionHandler.ArchiveDiskActionHandler_responseQueue.removeLast(); // L: 24
			} // L: 25

			if (var0 == null) {
				return; // L: 26
			}

			var0.archive.load(var0.archiveDisk, (int)var0.key, var0.data, false); // L: 27
		}
	}

	@ObfuscatedName("mt")
	@ObfuscatedSignature(
		descriptor = "(IIIII)V",
		garbageValue = "286537366"
	)
	static void method8063(int var0, int var1, int var2, int var3) {
		Widget var4 = class380.field4414.method6347(var0, var1); // L: 9978
		if (var4 != null && var4.onTargetEnter != null) { // L: 9979
			ScriptEvent var5 = new ScriptEvent(); // L: 9980
			var5.widget = var4; // L: 9981
			var5.args = var4.onTargetEnter; // L: 9982
			WorldMapSectionType.runScriptEvent(var5); // L: 9983
		}

		Client.field554 = var3; // L: 9985
		Client.isSpellSelected = true; // L: 9986
		ModelData0.field3101 = var0; // L: 9987
		Client.field666 = var1; // L: 9988
		class60.field431 = var2; // L: 9989
		FaceNormal.invalidateWidget(var4); // L: 9990
	} // L: 9991
}
