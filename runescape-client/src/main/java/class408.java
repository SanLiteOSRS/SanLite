import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ox")
public class class408 {
	@ObfuscatedName("jc")
	@ObfuscatedGetter(
		intValue = 1266786605
	)
	@Export("cameraPitch")
	static int cameraPitch;
	@ObfuscatedName("a")
	float field4576;
	@ObfuscatedName("f")
	float field4570;
	@ObfuscatedName("c")
	float field4571;
	@ObfuscatedName("x")
	float field4569;
	@ObfuscatedName("h")
	float field4573;
	@ObfuscatedName("j")
	float field4574;
	@ObfuscatedName("y")
	float field4575;
	@ObfuscatedName("d")
	float field4572;
	@ObfuscatedName("n")
	float field4577;
	@ObfuscatedName("r")
	float field4578;
	@ObfuscatedName("l")
	float field4579;
	@ObfuscatedName("s")
	float field4580;

	static {
		new class408();
	} // L: 6

	class408() {
		this.method7713(); // L: 22
	} // L: 23

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1824130977"
	)
	void method7713() {
		this.field4580 = 0.0F; // L: 26
		this.field4579 = 0.0F; // L: 27
		this.field4578 = 0.0F; // L: 28
		this.field4572 = 0.0F; // L: 29
		this.field4575 = 0.0F; // L: 30
		this.field4574 = 0.0F; // L: 31
		this.field4569 = 0.0F; // L: 32
		this.field4571 = 0.0F; // L: 33
		this.field4570 = 0.0F; // L: 34
		this.field4577 = 1.0F; // L: 35
		this.field4573 = 1.0F; // L: 36
		this.field4576 = 1.0F; // L: 37
	} // L: 38

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "12"
	)
	void method7712(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 41
		float var3 = (float)Math.sin((double)var1); // L: 42
		float var4 = this.field4570; // L: 43
		float var5 = this.field4573; // L: 44
		float var6 = this.field4572; // L: 45
		float var7 = this.field4579; // L: 46
		this.field4570 = var2 * var4 - this.field4571 * var3; // L: 47
		this.field4571 = var3 * var4 + var2 * this.field4571; // L: 48
		this.field4573 = var2 * var5 - var3 * this.field4574; // L: 49
		this.field4574 = var3 * var5 + this.field4574 * var2; // L: 50
		this.field4572 = var2 * var6 - this.field4577 * var3; // L: 51
		this.field4577 = this.field4577 * var2 + var3 * var6; // L: 52
		this.field4579 = var7 * var2 - var3 * this.field4580; // L: 53
		this.field4580 = var3 * var7 + var2 * this.field4580; // L: 54
	} // L: 55

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(FI)V",
		garbageValue = "-84882550"
	)
	void method7730(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 58
		float var3 = (float)Math.sin((double)var1); // L: 59
		float var4 = this.field4576; // L: 60
		float var5 = this.field4569; // L: 61
		float var6 = this.field4575; // L: 62
		float var7 = this.field4578; // L: 63
		this.field4576 = var2 * var4 + this.field4571 * var3; // L: 64
		this.field4571 = this.field4571 * var2 - var3 * var4; // L: 65
		this.field4569 = var5 * var2 + this.field4574 * var3; // L: 66
		this.field4574 = this.field4574 * var2 - var3 * var5; // L: 67
		this.field4575 = this.field4577 * var3 + var6 * var2; // L: 68
		this.field4577 = this.field4577 * var2 - var6 * var3; // L: 69
		this.field4578 = var3 * this.field4580 + var7 * var2; // L: 70
		this.field4580 = var2 * this.field4580 - var3 * var7; // L: 71
	} // L: 72

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(FB)V",
		garbageValue = "-71"
	)
	void method7731(float var1) {
		float var2 = (float)Math.cos((double)var1); // L: 75
		float var3 = (float)Math.sin((double)var1); // L: 76
		float var4 = this.field4576; // L: 77
		float var5 = this.field4569; // L: 78
		float var6 = this.field4575; // L: 79
		float var7 = this.field4578; // L: 80
		this.field4576 = var2 * var4 - var3 * this.field4570; // L: 81
		this.field4570 = var3 * var4 + this.field4570 * var2; // L: 82
		this.field4569 = var2 * var5 - this.field4573 * var3; // L: 83
		this.field4573 = var5 * var3 + var2 * this.field4573; // L: 84
		this.field4575 = var2 * var6 - this.field4572 * var3; // L: 85
		this.field4572 = this.field4572 * var2 + var6 * var3; // L: 86
		this.field4578 = var7 * var2 - var3 * this.field4579; // L: 87
		this.field4579 = var7 * var3 + this.field4579 * var2; // L: 88
	} // L: 89

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(FFFI)V",
		garbageValue = "-682979851"
	)
	void method7714(float var1, float var2, float var3) {
		this.field4578 += var1; // L: 92
		this.field4579 += var2; // L: 93
		this.field4580 += var3; // L: 94
	} // L: 95

	public String toString() {
		return this.field4576 + "," + this.field4569 + "," + this.field4575 + "," + this.field4578 + "\n" + this.field4570 + "," + this.field4573 + "," + this.field4572 + "," + this.field4579 + "\n" + this.field4571 + "," + this.field4574 + "," + this.field4577 + "," + this.field4580; // L: 99
	}

	@ObfuscatedName("ll")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "946251139"
	)
	static final void method7728(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : class198.guestClanChannel; // L: 12540
		if (var2 != null && var1 >= 0 && var1 < var2.method3215()) { // L: 12541
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12542
			if (var3.rank == -1) { // L: 12543
				String var4 = var3.username.getName(); // L: 12544
				PacketBufferNode var5 = FloorUnderlayDefinition.getPacketBufferNode(ClientPacket.field3039, Client.packetWriter.isaacCipher); // L: 12545
				var5.packetBuffer.writeByte(3 + Actor.stringCp1252NullTerminatedByteSize(var4)); // L: 12546
				var5.packetBuffer.writeByte(var0); // L: 12547
				var5.packetBuffer.writeShort(var1); // L: 12548
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12549
				Client.packetWriter.addNode(var5); // L: 12550
			}
		}
	} // L: 12551
}
