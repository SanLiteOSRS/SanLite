import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sc")
public class class492 extends class494 {
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -798845665
	)
	int field4908;
	@ObfuscatedName("al")
	@ObfuscatedGetter(
		intValue = -1060237703
	)
	int field4909;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -1297115195
	)
	int field4910;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = 862957485
	)
	int field4911;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1475547779
	)
	int field4912;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 1523701293
	)
	int field4913;

	public class492(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		super(var7, var8); // L: 12
		this.field4908 = 0; // L: 4
		this.field4909 = 0; // L: 5
		this.field4910 = 0; // L: 6
		this.field4911 = 0; // L: 7
		this.field4912 = 0; // L: 8
		this.field4913 = 0; // L: 9
		this.field4908 = var1; // L: 13
		this.field4909 = var2; // L: 14
		this.field4910 = var3; // L: 15
		this.field4911 = var4; // L: 16
		this.field4912 = var5; // L: 17
		this.field4913 = var6; // L: 18
	} // L: 19

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-437522182"
	)
	public int vmethod8614() {
		double var1 = this.method8628(); // L: 22
		return (int)Math.round(var1 * (double)(this.field4911 - this.field4908) + (double)this.field4908); // L: 23
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1670157872"
	)
	public int vmethod8622() {
		double var1 = this.method8628(); // L: 27
		return (int)Math.round((double)this.field4909 + var1 * (double)(this.field4912 - this.field4909)); // L: 28
	}

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "54"
	)
	public int vmethod8618() {
		double var1 = this.method8628(); // L: 32
		return (int)Math.round((double)this.field4910 + (double)(this.field4913 - this.field4910) * var1); // L: 33
	}

	@ObfuscatedName("nh")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "69"
	)
	@Export("FriendSystem_invalidateIgnoreds")
	static final void FriendSystem_invalidateIgnoreds() {
		Iterator var0 = Messages.Messages_hashTable.iterator(); // L: 12592

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next(); // L: 12593
			var1.clearIsFromIgnored(); // L: 12595
		}

		if (class358.friendsChatManager != null) { // L: 12599
			class358.friendsChatManager.invalidateIgnoreds(); // L: 12600
		}

	} // L: 12602
}
