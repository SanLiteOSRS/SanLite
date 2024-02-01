import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("is")
@Implements("MilliClock")
public class MilliClock extends Clock {
	@ObfuscatedName("am")
	long[] field2318;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = -1614801927
	)
	int field2320;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -202644955
	)
	int field2319;
	@ObfuscatedName("aj")
	@ObfuscatedGetter(
		longValue = 2628243818144593535L
	)
	long field2323;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = -1309380721
	)
	int field2321;
	@ObfuscatedName("ar")
	@ObfuscatedGetter(
		intValue = 832911509
	)
	int field2322;

	public MilliClock() {
		this.field2318 = new long[10]; // L: 7
		this.field2320 = 256;
		this.field2319 = 1;
		this.field2321 = 0;
		this.field2323 = UserComparator9.method2973();

		for (int var1 = 0; var1 < 10; ++var1) { // L: 19
			this.field2318[var1] = this.field2323;
		}

	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "65280"
	)
	@Export("mark")
	public void mark() {
		for (int var1 = 0; var1 < 10; ++var1) {
			this.field2318[var1] = 0L;
		}

	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "-2123373080"
	)
	@Export("wait")
	public int wait(int var1, int var2) {
		int var3 = this.field2320;
		int var4 = this.field2319;
		this.field2320 = 300;
		this.field2319 = 1; // L: 34
		this.field2323 = UserComparator9.method2973();
		if (this.field2318[this.field2322] == 0L) {
			this.field2320 = var3;
			this.field2319 = var4;
		} else if (this.field2323 > this.field2318[this.field2322]) { // L: 40
			this.field2320 = (int)((long)(var1 * 2560) / (this.field2323 - this.field2318[this.field2322]));
		}

		if (this.field2320 < 25) { // L: 41
			this.field2320 = 25;
		}

		if (this.field2320 > 256) { // L: 42
			this.field2320 = 256; // L: 43
			this.field2319 = (int)((long)var1 - (this.field2323 - this.field2318[this.field2322]) / 10L); // L: 44
		}

		if (this.field2319 > var1) { // L: 46
			this.field2319 = var1;
		}

		this.field2318[this.field2322] = this.field2323; // L: 47
		this.field2322 = (this.field2322 + 1) % 10;
		int var5;
		if (this.field2319 > 1) { // L: 49
			for (var5 = 0; var5 < 10; ++var5) { // L: 50
				if (this.field2318[var5] != 0L) { // L: 51
					this.field2318[var5] += (long)this.field2319;
				}
			}
		}

		if (this.field2319 < var2) { // L: 54
			this.field2319 = var2;
		}

		BuddyRankComparator.method2992((long)this.field2319); // L: 55

		for (var5 = 0; this.field2321 < 256; this.field2321 += this.field2320) { // L: 56 57 59
			++var5; // L: 58
		}

		this.field2321 &= 255; // L: 61
		return var5; // L: 62
	}

	@ObfuscatedName("am")
	public static final int method4269(double var0, double var2, double var4) {
		double var6 = var4; // L: 9
		double var8 = var4; // L: 10
		double var10 = var4; // L: 11
		if (var2 != 0.0D) { // L: 12
			double var12;
			if (var4 < 0.5D) { // L: 14
				var12 = var4 * (var2 + 1.0D);
			} else {
				var12 = var4 + var2 - var2 * var4; // L: 15
			}

			double var14 = var4 * 2.0D - var12; // L: 16
			double var16 = var0 + 0.3333333333333333D; // L: 17
			if (var16 > 1.0D) { // L: 18
				--var16;
			}

			double var20 = var0 - 0.3333333333333333D; // L: 20
			if (var20 < 0.0D) { // L: 21
				++var20;
			}

			if (6.0D * var16 < 1.0D) { // L: 22
				var6 = var16 * 6.0D * (var12 - var14) + var14;
			} else if (2.0D * var16 < 1.0D) { // L: 23
				var6 = var12;
			} else if (var16 * 3.0D < 2.0D) { // L: 24
				var6 = 6.0D * (0.6666666666666666D - var16) * (var12 - var14) + var14;
			} else {
				var6 = var14; // L: 25
			}

			if (var0 * 6.0D < 1.0D) { // L: 26
				var8 = var14 + var0 * (var12 - var14) * 6.0D;
			} else if (2.0D * var0 < 1.0D) { // L: 27
				var8 = var12;
			} else if (var0 * 3.0D < 2.0D) {
				var8 = 6.0D * (var12 - var14) * (0.6666666666666666D - var0) + var14; // L: 28
			} else {
				var8 = var14; // L: 29
			}

			if (var20 * 6.0D < 1.0D) { // L: 30
				var10 = var14 + var20 * 6.0D * (var12 - var14);
			} else if (2.0D * var20 < 1.0D) { // L: 31
				var10 = var12;
			} else if (3.0D * var20 < 2.0D) { // L: 32
				var10 = var14 + 6.0D * (0.6666666666666666D - var20) * (var12 - var14);
			} else {
				var10 = var14; // L: 33
			}
		}

		int var22 = (int)(256.0D * var6); // L: 35
		int var13 = (int)(256.0D * var8); // L: 36
		int var23 = (int)(var10 * 256.0D); // L: 37
		int var15 = var23 + (var13 << 8) + (var22 << 16); // L: 38
		return var15; // L: 39
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(CI)Z",
		garbageValue = "1037743110"
	)
	public static final boolean method4262(char var0) {
		return var0 == 160 || var0 == ' ' || var0 == '_' || var0 == '-'; // L: 48
	}

	@ObfuscatedName("oe")
	@ObfuscatedSignature(
		descriptor = "(III)V",
		garbageValue = "519905554"
	)
	static final void method4268(int var0, int var1) {
		ClanChannel var2 = var0 >= 0 ? Client.currentClanChannels[var0] : UserComparator4.guestClanChannel; // L: 12500
		if (var2 != null && var1 >= 0 && var1 < var2.method3492()) { // L: 12501
			ClanChannelMember var3 = (ClanChannelMember)var2.members.get(var1); // L: 12502
			if (var3.rank == -1) { // L: 12503
				String var4 = var3.username.getName(); // L: 12504
				PacketBufferNode var5 = class482.getPacketBufferNode(ClientPacket.field3189, Client.packetWriter.isaacCipher); // L: 12505
				var5.packetBuffer.writeByte(3 + CollisionMap.stringCp1252NullTerminatedByteSize(var4)); // L: 12506
				var5.packetBuffer.writeByte(var0); // L: 12507
				var5.packetBuffer.writeShort(var1); // L: 12508
				var5.packetBuffer.writeStringCp1252NullTerminated(var4); // L: 12509
				Client.packetWriter.addNode(var5); // L: 12510
			}
		}
	} // L: 12511
}
