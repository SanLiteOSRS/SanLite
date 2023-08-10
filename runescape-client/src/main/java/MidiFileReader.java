import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("lb")
@Implements("MidiFileReader")
public class MidiFileReader {
	@ObfuscatedName("ap")
	static final byte[] field3451;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lty;"
	)
	@Export("buffer")
	Buffer buffer;
	@ObfuscatedName("ay")
	@Export("division")
	int division;
	@ObfuscatedName("ar")
	@Export("trackStarts")
	int[] trackStarts;
	@ObfuscatedName("am")
	@Export("trackPositions")
	int[] trackPositions;
	@ObfuscatedName("as")
	@Export("trackLengths")
	int[] trackLengths;
	@ObfuscatedName("aj")
	int[] field3449;
	@ObfuscatedName("ag")
	int field3442;
	@ObfuscatedName("av")
	long field3450;

	static {
		field3451 = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // L: 17
	}

	MidiFileReader() {
		this.buffer = new Buffer((byte[])null); // L: 8
	} // L: 23

	@ObfuscatedName("aw")
	@Export("parse")
	void parse(byte[] var1) {
		this.buffer.array = var1; // L: 26
		this.buffer.offset = 10; // L: 29
		int var2 = this.buffer.readUnsignedShort(); // L: 30
		this.division = this.buffer.readUnsignedShort(); // L: 32
		this.field3442 = 500000; // L: 33
		this.trackStarts = new int[var2]; // L: 34

		Buffer var10000;
		int var3;
		int var5;
		for (var3 = 0; var3 < var2; var10000.offset += var5) { // L: 35
			int var4 = this.buffer.readInt(); // L: 36
			var5 = this.buffer.readInt(); // L: 37
			if (var4 == 1297379947) { // L: 38
				this.trackStarts[var3] = this.buffer.offset; // L: 39
				++var3; // L: 40
			}

			var10000 = this.buffer; // L: 42
		}

		this.field3450 = 0L; // L: 44
		this.trackPositions = new int[var2]; // L: 45

		for (var3 = 0; var3 < var2; ++var3) { // L: 46
			this.trackPositions[var3] = this.trackStarts[var3];
		}

		this.trackLengths = new int[var2]; // L: 47
		this.field3449 = new int[var2]; // L: 48
	} // L: 49

	@ObfuscatedName("ay")
	@Export("clear")
	void clear() {
		this.buffer.array = null; // L: 52
		this.trackStarts = null; // L: 53
		this.trackPositions = null; // L: 54
		this.trackLengths = null; // L: 55
		this.field3449 = null; // L: 56
	} // L: 57

	@ObfuscatedName("ar")
	@Export("isReady")
	boolean isReady() {
		return this.buffer.array != null; // L: 60
	}

	@ObfuscatedName("am")
	@Export("trackCount")
	int trackCount() {
		return this.trackPositions.length; // L: 64
	}

	@ObfuscatedName("as")
	@Export("gotoTrack")
	void gotoTrack(int var1) {
		this.buffer.offset = this.trackPositions[var1]; // L: 68
	} // L: 69

	@ObfuscatedName("aj")
	@Export("markTrackPosition")
	void markTrackPosition(int var1) {
		this.trackPositions[var1] = this.buffer.offset; // L: 72
	} // L: 73

	@ObfuscatedName("ag")
	@Export("setTrackDone")
	void setTrackDone() {
		this.buffer.offset = -1; // L: 76
	} // L: 77

	@ObfuscatedName("az")
	@Export("readTrackLength")
	void readTrackLength(int var1) {
		int var2 = this.buffer.readVarInt(); // L: 80
		int[] var10000 = this.trackLengths;
		var10000[var1] += var2; // L: 81
	} // L: 82

	@ObfuscatedName("av")
	@Export("readMessage")
	int readMessage(int var1) {
		int var2 = this.readMessage0(var1); // L: 85
		return var2; // L: 86
	}

	@ObfuscatedName("ap")
	@Export("readMessage0")
	int readMessage0(int var1) {
		byte var2 = this.buffer.array[this.buffer.offset]; // L: 90
		int var5;
		if (var2 < 0) { // L: 91
			var5 = var2 & 255; // L: 92
			this.field3449[var1] = var5; // L: 93
			++this.buffer.offset; // L: 94
		} else {
			var5 = this.field3449[var1]; // L: 97
		}

		if (var5 != 240 && var5 != 247) { // L: 99
			return this.method5955(var1, var5); // L: 112
		} else {
			int var3 = this.buffer.readVarInt(); // L: 100
			if (var5 == 247 && var3 > 0) { // L: 101
				int var4 = this.buffer.array[this.buffer.offset] & 255; // L: 102
				if (var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) { // L: 103
					++this.buffer.offset; // L: 104
					this.field3449[var1] = var4; // L: 105
					return this.method5955(var1, var4); // L: 106
				}
			}

			Buffer var10000 = this.buffer; // L: 109
			var10000.offset += var3;
			return 0; // L: 110
		}
	}

	@ObfuscatedName("aq")
	int method5955(int var1, int var2) {
		int var4;
		if (var2 == 255) { // L: 116
			int var7 = this.buffer.readUnsignedByte(); // L: 117
			var4 = this.buffer.readVarInt(); // L: 118
			Buffer var10000;
			if (var7 == 47) { // L: 119
				var10000 = this.buffer; // L: 120
				var10000.offset += var4;
				return 1; // L: 121
			} else if (var7 == 81) { // L: 123
				int var5 = this.buffer.readMedium(); // L: 124
				var4 -= 3; // L: 125
				int var6 = this.trackLengths[var1]; // L: 126
				this.field3450 += (long)var6 * (long)(this.field3442 - var5); // L: 127
				this.field3442 = var5; // L: 128
				var10000 = this.buffer; // L: 129
				var10000.offset += var4;
				return 2; // L: 130
			} else {
				var10000 = this.buffer; // L: 132
				var10000.offset += var4;
				return 3; // L: 133
			}
		} else {
			byte var3 = field3451[var2 - 128]; // L: 135
			var4 = var2; // L: 136
			if (var3 >= 1) { // L: 137
				var4 = var2 | this.buffer.readUnsignedByte() << 8;
			}

			if (var3 >= 2) { // L: 138
				var4 |= this.buffer.readUnsignedByte() << 16;
			}

			return var4; // L: 139
		}
	}

	@ObfuscatedName("at")
	long method5956(int var1) {
		return this.field3450 + (long)var1 * (long)this.field3442; // L: 143
	}

	@ObfuscatedName("ah")
	@Export("getPrioritizedTrack")
	int getPrioritizedTrack() {
		int var1 = this.trackPositions.length; // L: 147
		int var2 = -1; // L: 148
		int var3 = Integer.MAX_VALUE; // L: 149

		for (int var4 = 0; var4 < var1; ++var4) { // L: 150
			if (this.trackPositions[var4] >= 0 && this.trackLengths[var4] < var3) { // L: 151 152
				var2 = var4; // L: 153
				var3 = this.trackLengths[var4]; // L: 154
			}
		}

		return var2; // L: 157
	}

	@ObfuscatedName("ax")
	@Export("isDone")
	boolean isDone() {
		int var1 = this.trackPositions.length; // L: 161

		for (int var2 = 0; var2 < var1; ++var2) { // L: 162
			if (this.trackPositions[var2] >= 0) {
				return false;
			}
		}

		return true; // L: 163
	}

	@ObfuscatedName("aa")
	@Export("reset")
	void reset(long var1) {
		this.field3450 = var1; // L: 167
		int var3 = this.trackPositions.length; // L: 168

		for (int var4 = 0; var4 < var3; ++var4) { // L: 169
			this.trackLengths[var4] = 0; // L: 170
			this.field3449[var4] = 0; // L: 171
			this.buffer.offset = this.trackStarts[var4]; // L: 172
			this.readTrackLength(var4); // L: 173
			this.trackPositions[var4] = this.buffer.offset; // L: 174
		}

	} // L: 176
}
