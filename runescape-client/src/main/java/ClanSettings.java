import java.io.File;
import java.io.RandomAccessFile;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ez")
@Implements("ClanSettings")
public class ClanSettings {
	@ObfuscatedName("eh")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive20")
	static Archive archive20;
	@ObfuscatedName("q")
	@Export("useHashes")
	boolean useHashes;
	@ObfuscatedName("f")
	@Export("useNames")
	boolean useNames;
	@ObfuscatedName("u")
	@ObfuscatedGetter(
		longValue = -1249798400676784157L
	)
	long field1613;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1438563393
	)
	int field1614;
	@ObfuscatedName("w")
	@Export("name")
	public String name;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -160458011
	)
	int field1628;
	@ObfuscatedName("j")
	@Export("allowGuests")
	public boolean allowGuests;
	@ObfuscatedName("h")
	public byte field1631;
	@ObfuscatedName("a")
	public byte field1619;
	@ObfuscatedName("d")
	public byte field1632;
	@ObfuscatedName("n")
	public byte field1621;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = 8584863
	)
	@Export("memberCount")
	public int memberCount;
	@ObfuscatedName("g")
	@Export("memberHashes")
	long[] memberHashes;
	@ObfuscatedName("p")
	@Export("memberRanks")
	public byte[] memberRanks;
	@ObfuscatedName("b")
	@Export("sortedMembers")
	int[] sortedMembers;
	@ObfuscatedName("l")
	int[] field1626;
	@ObfuscatedName("y")
	public int[] field1627;
	@ObfuscatedName("k")
	public boolean[] field1622;
	@ObfuscatedName("v")
	@ObfuscatedGetter(
		intValue = 499170237
	)
	@Export("currentOwner")
	public int currentOwner;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = -1651175749
	)
	public int field1630;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -998247179
	)
	@Export("bannedMemberCount")
	public int bannedMemberCount;
	@ObfuscatedName("s")
	@Export("bannedMemberHashes")
	long[] bannedMemberHashes;
	@ObfuscatedName("i")
	@Export("memberNames")
	public String[] memberNames;
	@ObfuscatedName("r")
	@Export("bannedMemberNames")
	public String[] bannedMemberNames;
	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "Lpl;"
	)
	@Export("parameters")
	IterableNodeHashTable parameters;

	@ObfuscatedSignature(
		descriptor = "(Lqw;)V"
	)
	public ClanSettings(Buffer var1) {
		this.field1614 = 0; // L: 14
		this.name = null; // L: 15
		this.field1628 = 0; // L: 16
		this.currentOwner = -1;
		this.field1630 = -1; // L: 30
		this.method2991(var1); // L: 43
	} // L: 44

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-1318167530"
	)
	void method2972(int var1) {
		if (this.useHashes) { // L: 47
			if (this.memberHashes != null) { // L: 48
				System.arraycopy(this.memberHashes, 0, this.memberHashes = new long[var1], 0, this.memberCount);
			} else {
				this.memberHashes = new long[var1]; // L: 49
			}
		}

		if (this.useNames) { // L: 51
			if (this.memberNames != null) { // L: 52
				System.arraycopy(this.memberNames, 0, this.memberNames = new String[var1], 0, this.memberCount);
			} else {
				this.memberNames = new String[var1]; // L: 53
			}
		}

		if (this.memberRanks != null) {
			System.arraycopy(this.memberRanks, 0, this.memberRanks = new byte[var1], 0, this.memberCount); // L: 55
		} else {
			this.memberRanks = new byte[var1]; // L: 56
		}

		if (this.field1626 != null) { // L: 57
			System.arraycopy(this.field1626, 0, this.field1626 = new int[var1], 0, this.memberCount);
		} else {
			this.field1626 = new int[var1]; // L: 58
		}

		if (this.field1627 != null) { // L: 59
			System.arraycopy(this.field1627, 0, this.field1627 = new int[var1], 0, this.memberCount);
		} else {
			this.field1627 = new int[var1]; // L: 60
		}

		if (this.field1622 != null) {
			System.arraycopy(this.field1622, 0, this.field1622 = new boolean[var1], 0, this.memberCount); // L: 61
		} else {
			this.field1622 = new boolean[var1]; // L: 62
		}

	} // L: 63

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(IS)V",
		garbageValue = "426"
	)
	void method2973(int var1) {
		if (this.useHashes) { // L: 66
			if (this.bannedMemberHashes != null) {
				System.arraycopy(this.bannedMemberHashes, 0, this.bannedMemberHashes = new long[var1], 0, this.bannedMemberCount); // L: 67
			} else {
				this.bannedMemberHashes = new long[var1]; // L: 68
			}
		}

		if (this.useNames) { // L: 70
			if (this.bannedMemberNames != null) { // L: 71
				System.arraycopy(this.bannedMemberNames, 0, this.bannedMemberNames = new String[var1], 0, this.bannedMemberCount);
			} else {
				this.bannedMemberNames = new String[var1]; // L: 72
			}
		}

	} // L: 74

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)I",
		garbageValue = "1623968459"
	)
	public int method3042(String var1) {
		if (var1 != null && var1.length() != 0) { // L: 77
			for (int var2 = 0; var2 < this.memberCount; ++var2) { // L: 78
				if (this.memberNames[var2].equals(var1)) { // L: 79
					return var2;
				}
			}

			return -1; // L: 81
		} else {
			return -1;
		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(IIII)I",
		garbageValue = "-714384166"
	)
	public int method2975(int var1, int var2, int var3) {
		int var4 = var3 == 31 ? -1 : (1 << var3 + 1) - 1; // L: 85
		return (this.field1626[var1] & var4) >>> var2; // L: 86
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(II)Ljava/lang/Integer;",
		garbageValue = "-1955488610"
	)
	@Export("getTitleGroupValue")
	public Integer getTitleGroupValue(int var1) {
		if (this.parameters == null) { // L: 90
			return null;
		} else {
			Node var2 = this.parameters.get((long)var1); // L: 91
			return var2 != null && var2 instanceof IntegerNode ? new Integer(((IntegerNode)var2).integer) : null; // L: 92 93
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)[I",
		garbageValue = "1646879206"
	)
	@Export("getSortedMembers")
	public int[] getSortedMembers() {
		if (this.sortedMembers == null) {
			String[] var1 = new String[this.memberCount];
			this.sortedMembers = new int[this.memberCount];

			for (int var2 = 0; var2 < this.memberCount; this.sortedMembers[var2] = var2++) { // L: 103
				var1[var2] = this.memberNames[var2]; // L: 101
				if (var1[var2] != null) { // L: 102
					var1[var2] = var1[var2].toLowerCase();
				}
			}

			class390.method7091(var1, this.sortedMembers); // L: 105
		}

		return this.sortedMembers; // L: 107
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;IB)V",
		garbageValue = "83"
	)
	void method3031(long var1, String var3, int var4) {
		if (var3 != null && var3.length() == 0) { // L: 111
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 112
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 113
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.memberHashes == null || this.memberCount >= this.memberHashes.length) || var3 != null && (this.memberNames == null || this.memberCount >= this.memberNames.length)) { // L: 114
				this.method2972(this.memberCount + 5);
			}

			if (this.memberHashes != null) { // L: 115
				this.memberHashes[this.memberCount] = var1;
			}

			if (this.memberNames != null) { // L: 116
				this.memberNames[this.memberCount] = var3;
			}

			if (this.currentOwner == -1) { // L: 117
				this.currentOwner = this.memberCount; // L: 118
				this.memberRanks[this.memberCount] = 126; // L: 119
			} else {
				this.memberRanks[this.memberCount] = 0; // L: 122
			}

			this.field1626[this.memberCount] = 0; // L: 124
			this.field1627[this.memberCount] = var4; // L: 125
			this.field1622[this.memberCount] = false; // L: 126
			++this.memberCount; // L: 127
			this.sortedMembers = null; // L: 128
		}
	} // L: 129

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "-283696886"
	)
	void method2979(int var1) {
		if (var1 >= 0 && var1 < this.memberCount) { // L: 132
			--this.memberCount; // L: 133
			this.sortedMembers = null; // L: 134
			if (this.memberCount == 0) { // L: 135
				this.memberHashes = null; // L: 136
				this.memberNames = null; // L: 137
				this.memberRanks = null; // L: 138
				this.field1626 = null; // L: 139
				this.field1627 = null; // L: 140
				this.field1622 = null; // L: 141
				this.currentOwner = -1; // L: 142
				this.field1630 = -1; // L: 143
			} else {
				System.arraycopy(this.memberRanks, var1 + 1, this.memberRanks, var1, this.memberCount - var1); // L: 146
				System.arraycopy(this.field1626, var1 + 1, this.field1626, var1, this.memberCount - var1); // L: 147
				System.arraycopy(this.field1627, var1 + 1, this.field1627, var1, this.memberCount - var1); // L: 148
				System.arraycopy(this.field1622, var1 + 1, this.field1622, var1, this.memberCount - var1);
				if (this.memberHashes != null) {
					System.arraycopy(this.memberHashes, var1 + 1, this.memberHashes, var1, this.memberCount - var1);
				}

				if (this.memberNames != null) {
					System.arraycopy(this.memberNames, var1 + 1, this.memberNames, var1, this.memberCount - var1);
				}

				this.updateOwner();
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "21"
	)
	@Export("updateOwner")
	void updateOwner() {
		if (this.memberCount == 0) { // L: 157
			this.currentOwner = -1;
			this.field1630 = -1;
		} else {
			this.currentOwner = -1; // L: 162
			this.field1630 = -1; // L: 163
			int var1 = 0; // L: 164
			byte var2 = this.memberRanks[0]; // L: 165

			for (int var3 = 1; var3 < this.memberCount; ++var3) { // L: 166
				if (this.memberRanks[var3] > var2) { // L: 167
					if (var2 == 125) { // L: 168
						this.field1630 = var1;
					}

					var1 = var3; // L: 169
					var2 = this.memberRanks[var3]; // L: 170
				} else if (this.field1630 == -1 && this.memberRanks[var3] == 125) { // L: 172
					this.field1630 = var3; // L: 173
				}
			}

			this.currentOwner = var1; // L: 176
			if (this.currentOwner != -1) { // L: 177
				this.memberRanks[this.currentOwner] = 126;
			}

		}
	} // L: 160 178

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)V",
		garbageValue = "427836240"
	)
	void method2987(long var1, String var3) {
		if (var3 != null && var3.length() == 0) { // L: 181
			var3 = null;
		}

		if (this.useHashes != var1 > 0L) { // L: 182
			throw new RuntimeException("");
		} else if (this.useNames != (var3 != null)) { // L: 183
			throw new RuntimeException("");
		} else {
			if (var1 > 0L && (this.bannedMemberHashes == null || this.bannedMemberCount >= this.bannedMemberHashes.length) || var3 != null && (this.bannedMemberNames == null || this.bannedMemberCount >= this.bannedMemberNames.length)) { // L: 184
				this.method2973(this.bannedMemberCount + 5);
			}

			if (this.bannedMemberHashes != null) { // L: 185
				this.bannedMemberHashes[this.bannedMemberCount] = var1;
			}

			if (this.bannedMemberNames != null) { // L: 186
				this.bannedMemberNames[this.bannedMemberCount] = var3;
			}

			++this.bannedMemberCount; // L: 187
		}
	} // L: 188

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "23"
	)
	void method2982(int var1) {
		--this.bannedMemberCount; // L: 191
		if (this.bannedMemberCount == 0) { // L: 192
			this.bannedMemberHashes = null; // L: 193
			this.bannedMemberNames = null; // L: 194
		} else {
			if (this.bannedMemberHashes != null) { // L: 197
				System.arraycopy(this.bannedMemberHashes, var1 + 1, this.bannedMemberHashes, var1, this.bannedMemberCount - var1);
			}

			if (this.bannedMemberNames != null) {
				System.arraycopy(this.bannedMemberNames, var1 + 1, this.bannedMemberNames, var1, this.bannedMemberCount - var1); // L: 198
			}
		}

	} // L: 200

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IBI)I",
		garbageValue = "299978303"
	)
	int method2983(int var1, byte var2) {
		if (var2 != 126 && var2 != 127) { // L: 203
			if (this.currentOwner == var1 && (this.field1630 == -1 || this.memberRanks[this.field1630] < 125)) { // L: 204
				return -1;
			} else if (this.memberRanks[var1] == var2) { // L: 205
				return -1;
			} else {
				this.memberRanks[var1] = var2; // L: 206
				this.updateOwner(); // L: 207
				return var1; // L: 208
			}
		} else {
			return -1;
		}
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(IB)Z",
		garbageValue = "125"
	)
	boolean method3040(int var1) {
		if (this.currentOwner != var1 && this.memberRanks[var1] != 126) { // L: 212
			this.memberRanks[this.currentOwner] = 125; // L: 213
			this.field1630 = this.currentOwner; // L: 214
			this.memberRanks[var1] = 126; // L: 215
			this.currentOwner = var1; // L: 216
			return true; // L: 217
		} else {
			return false;
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(IZI)I",
		garbageValue = "1675998830"
	)
	int method2974(int var1, boolean var2) {
		if (this.field1622[var1] == var2) { // L: 221
			return -1;
		} else {
			this.field1622[var1] = var2; // L: 222
			return var1; // L: 223
		}
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "(IIIIS)I",
		garbageValue = "321"
	)
	int method2986(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 227
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 228
		int var7 = var6 ^ var5; // L: 229
		var2 <<= var3; // L: 230
		var2 &= var7; // L: 231
		int var8 = this.field1626[var1]; // L: 232
		if ((var8 & var7) == var2) {
			return -1; // L: 233
		} else {
			var8 &= ~var7; // L: 234
			this.field1626[var1] = var8 | var2; // L: 235
			return var1; // L: 236
		}
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		descriptor = "(III)Z",
		garbageValue = "-1002453709"
	)
	boolean method2992(int var1, int var2) {
		if (this.parameters != null) { // L: 240
			Node var3 = this.parameters.get((long)var1); // L: 241
			if (var3 != null) { // L: 242
				if (var3 instanceof IntegerNode) { // L: 243
					IntegerNode var4 = (IntegerNode)var3; // L: 244
					if (var2 == var4.integer) { // L: 245
						return false;
					}

					var4.integer = var2; // L: 246
					return true; // L: 247
				}

				var3.remove(); // L: 249
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 252
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 253
		return true; // L: 254
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		descriptor = "(IIIII)Z",
		garbageValue = "509038177"
	)
	boolean method2988(int var1, int var2, int var3, int var4) {
		int var5 = (1 << var3) - 1; // L: 258
		int var6 = var4 == 31 ? -1 : (1 << var4 + 1) - 1; // L: 259
		int var7 = var6 ^ var5; // L: 260
		var2 <<= var3; // L: 261
		var2 &= var7; // L: 262
		if (this.parameters != null) { // L: 263
			Node var8 = this.parameters.get((long)var1); // L: 264
			if (var8 != null) { // L: 265
				if (var8 instanceof IntegerNode) { // L: 266
					IntegerNode var9 = (IntegerNode)var8; // L: 267
					if ((var9.integer & var7) == var2) { // L: 268
						return false;
					}

					var9.integer &= ~var7; // L: 269
					var9.integer |= var2; // L: 270
					return true; // L: 271
				}

				var8.remove(); // L: 273
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 276
		}

		this.parameters.put(new IntegerNode(var2), (long)var1); // L: 277
		return true; // L: 278
	}

	@ObfuscatedName("y")
	boolean method2989(int var1, long var2) {
		if (this.parameters != null) { // L: 282
			Node var4 = this.parameters.get((long)var1); // L: 283
			if (var4 != null) { // L: 284
				if (var4 instanceof class408) { // L: 285
					class408 var5 = (class408)var4; // L: 286
					if (var5.field4474 == var2) { // L: 287
						return false;
					}

					var5.field4474 = var2; // L: 288
					return true; // L: 289
				}

				var4.remove(); // L: 291
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 294
		}

		this.parameters.put(new class408(var2), (long)var1); // L: 295
		return true; // L: 296
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;I)Z",
		garbageValue = "438505582"
	)
	boolean method2990(int var1, String var2) {
		if (var2 == null) { // L: 300
			var2 = "";
		} else if (var2.length() > 80) { // L: 301
			var2 = var2.substring(0, 80);
		}

		if (this.parameters != null) { // L: 302
			Node var3 = this.parameters.get((long)var1); // L: 303
			if (var3 != null) { // L: 304
				if (var3 instanceof ObjectNode) { // L: 305
					ObjectNode var4 = (ObjectNode)var3; // L: 306
					if (var4.obj instanceof String) { // L: 307
						if (var2.equals(var4.obj)) { // L: 308
							return false;
						}

						var4.remove(); // L: 309
						this.parameters.put(new ObjectNode(var2), var4.key); // L: 310
						return true; // L: 311
					}
				}

				var3.remove(); // L: 314
			}
		} else {
			this.parameters = new IterableNodeHashTable(4); // L: 317
		}

		this.parameters.put(new ObjectNode(var2), (long)var1); // L: 318
		return true; // L: 319
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lqw;I)V",
		garbageValue = "791495604"
	)
	void method2991(Buffer var1) {
		int var2 = var1.readUnsignedByte(); // L: 323
		if (var2 >= 1 && var2 <= 6) { // L: 324
			int var3 = var1.readUnsignedByte(); // L: 325
			if ((var3 & 1) != 0) { // L: 326
				this.useHashes = true;
			}

			if ((var3 & 2) != 0) { // L: 327
				this.useNames = true;
			}

			if (!this.useHashes) { // L: 328
				this.memberHashes = null; // L: 329
				this.bannedMemberHashes = null; // L: 330
			}

			if (!this.useNames) { // L: 332
				this.memberNames = null; // L: 333
				this.bannedMemberNames = null; // L: 334
			}

			this.field1614 = var1.readInt(); // L: 336
			this.field1628 = var1.readInt(); // L: 337
			if (var2 <= 3 && this.field1628 != 0) { // L: 338
				this.field1628 += 16912800;
			}

			this.memberCount = var1.readUnsignedShort(); // L: 339
			this.bannedMemberCount = var1.readUnsignedByte(); // L: 340
			this.name = var1.readStringCp1252NullTerminated(); // L: 341
			if (var2 >= 4) { // L: 342
				var1.readInt(); // L: 343
			}

			this.allowGuests = var1.readUnsignedByte() == 1; // L: 345
			this.field1631 = var1.readByte(); // L: 346
			this.field1619 = var1.readByte(); // L: 347
			this.field1632 = var1.readByte(); // L: 348
			this.field1621 = var1.readByte(); // L: 349
			int var4;
			if (this.memberCount > 0) { // L: 350
				if (this.useHashes && (this.memberHashes == null || this.memberHashes.length < this.memberCount)) { // L: 351
					this.memberHashes = new long[this.memberCount];
				}

				if (this.useNames && (this.memberNames == null || this.memberNames.length < this.memberCount)) { // L: 352
					this.memberNames = new String[this.memberCount];
				}

				if (this.memberRanks == null || this.memberRanks.length < this.memberCount) { // L: 353
					this.memberRanks = new byte[this.memberCount];
				}

				if (this.field1626 == null || this.field1626.length < this.memberCount) { // L: 354
					this.field1626 = new int[this.memberCount];
				}

				if (this.field1627 == null || this.field1627.length < this.memberCount) { // L: 355
					this.field1627 = new int[this.memberCount];
				}

				if (this.field1622 == null || this.field1622.length < this.memberCount) { // L: 356
					this.field1622 = new boolean[this.memberCount];
				}

				for (var4 = 0; var4 < this.memberCount; ++var4) { // L: 357
					if (this.useHashes) { // L: 358
						this.memberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 359
						this.memberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}

					this.memberRanks[var4] = var1.readByte(); // L: 360
					if (var2 >= 2) { // L: 361
						this.field1626[var4] = var1.readInt();
					}

					if (var2 >= 5) { // L: 362
						this.field1627[var4] = var1.readUnsignedShort();
					} else {
						this.field1627[var4] = 0; // L: 363
					}

					if (var2 >= 6) { // L: 364
						this.field1622[var4] = var1.readUnsignedByte() == 1;
					} else {
						this.field1622[var4] = false; // L: 365
					}
				}

				this.updateOwner(); // L: 367
			}

			if (this.bannedMemberCount > 0) { // L: 369
				if (this.useHashes && (this.bannedMemberHashes == null || this.bannedMemberHashes.length < this.bannedMemberCount)) { // L: 370
					this.bannedMemberHashes = new long[this.bannedMemberCount];
				}

				if (this.useNames && (this.bannedMemberNames == null || this.bannedMemberNames.length < this.bannedMemberCount)) { // L: 371
					this.bannedMemberNames = new String[this.bannedMemberCount];
				}

				for (var4 = 0; var4 < this.bannedMemberCount; ++var4) { // L: 372
					if (this.useHashes) { // L: 373
						this.bannedMemberHashes[var4] = var1.readLong();
					}

					if (this.useNames) { // L: 374
						this.bannedMemberNames[var4] = var1.readStringCp1252NullTerminatedOrNull();
					}
				}
			}

			if (var2 >= 3) { // L: 377
				var4 = var1.readUnsignedShort(); // L: 378
				if (var4 > 0) { // L: 379
					this.parameters = new IterableNodeHashTable(var4 < 16 ? FloorOverlayDefinition.method3800(var4) : 16); // L: 380

					while (var4-- > 0) { // L: 381
						int var5 = var1.readInt(); // L: 382
						int var6 = var5 & 1073741823; // L: 383
						int var7 = var5 >>> 30; // L: 384
						if (var7 == 0) { // L: 385
							int var12 = var1.readInt(); // L: 386
							this.parameters.put(new IntegerNode(var12), (long)var6); // L: 387
						} else if (var7 == 1) { // L: 389
							long var10 = var1.readLong(); // L: 390
							this.parameters.put(new class408(var10), (long)var6); // L: 391
						} else if (var7 == 2) { // L: 393
							String var8 = var1.readStringCp1252NullTerminated(); // L: 394
							this.parameters.put(new ObjectNode(var8), (long)var6); // L: 395
						}
					}
				}
			}

		} else {
			throw new RuntimeException("" + var2);
		}
	} // L: 400

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(III)I",
		garbageValue = "1064254718"
	)
	public static int method3043(int var0, int var1) {
		return (int)Math.round(Math.atan2((double)var0, (double)var1) * 2607.5945876176133D) & 16383; // L: 29
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Ljava/io/File;ZB)Z",
		garbageValue = "1"
	)
	public static boolean method3006(File var0, boolean var1) {
		try {
			RandomAccessFile var2 = new RandomAccessFile(var0, "rw"); // L: 149
			int var3 = var2.read(); // L: 150
			var2.seek(0L); // L: 151
			var2.write(var3); // L: 152
			var2.seek(0L); // L: 153
			var2.close(); // L: 154
			if (var1) { // L: 155
				var0.delete();
			}

			return true; // L: 156
		} catch (Exception var4) { // L: 158
			return false; // L: 159
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(CI)C",
		garbageValue = "-1194739881"
	)
	static char method2993(char var0) {
		if (var0 == 198) { // L: 95
			return 'E';
		} else if (var0 == 230) { // L: 96
			return 'e';
		} else if (var0 == 223) {
			return 's'; // L: 97
		} else if (var0 == 338) { // L: 98
			return 'E';
		} else {
			return (char)(var0 == 339 ? 'e' : '\u0000'); // L: 99 100
		}
	}

	@ObfuscatedName("t")
	@ObfuscatedSignature(
		descriptor = "(ILbc;ZI)I",
		garbageValue = "209801067"
	)
	static int method2978(int var0, Script var1, boolean var2) {
		Widget var3 = FloorUnderlayDefinition.getWidget(Interpreter.Interpreter_intStack[--TaskHandler.Interpreter_intStackSize]); // L: 1351
		if (var0 == ScriptOpcodes.IF_GETSCROLLX) { // L: 1352
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollX; // L: 1353
			return 1; // L: 1354
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLY) { // L: 1356
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollY; // L: 1357
			return 1; // L: 1358
		} else if (var0 == ScriptOpcodes.IF_GETTEXT) { // L: 1360
			Interpreter.Interpreter_stringStack[++GrandExchangeOfferAgeComparator.Interpreter_stringStackSize - 1] = var3.text; // L: 1361
			return 1; // L: 1362
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLWIDTH) { // L: 1364
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollWidth; // L: 1365
			return 1; // L: 1366
		} else if (var0 == ScriptOpcodes.IF_GETSCROLLHEIGHT) { // L: 1368
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.scrollHeight; // L: 1369
			return 1; // L: 1370
		} else if (var0 == ScriptOpcodes.IF_GETMODELZOOM) { // L: 1372
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelZoom; // L: 1373
			return 1; // L: 1374
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_X) { // L: 1376
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelAngleX; // L: 1377
			return 1; // L: 1378
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Z) { // L: 1380
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelAngleZ; // L: 1381
			return 1; // L: 1382
		} else if (var0 == ScriptOpcodes.IF_GETMODELANGLE_Y) { // L: 1384
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelAngleY; // L: 1385
			return 1; // L: 1386
		} else if (var0 == ScriptOpcodes.IF_GETTRANS) { // L: 1388
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.transparencyTop; // L: 1389
			return 1; // L: 1390
		} else if (var0 == 2610) { // L: 1392
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.transparencyBot; // L: 1393
			return 1; // L: 1394
		} else if (var0 == ScriptOpcodes.IF_GETCOLOUR) { // L: 1396
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.color; // L: 1397
			return 1; // L: 1398
		} else if (var0 == ScriptOpcodes.IF_GETFILLCOLOUR) { // L: 1400
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.color2; // L: 1401
			return 1; // L: 1402
		} else if (var0 == 2613) { // L: 1404
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.fillMode.rsOrdinal(); // L: 1405
			return 1; // L: 1406
		} else if (var0 == ScriptOpcodes.IF_GETMODELTRANSPARENT) { // L: 1408
			Interpreter.Interpreter_intStack[++TaskHandler.Interpreter_intStackSize - 1] = var3.modelTransparency ? 1 : 0; // L: 1409
			return 1; // L: 1410
		} else if (var0 != 2615 && var0 != 2616) { // L: 1412
			return 2; // L: 1416
		} else {
			++TaskHandler.Interpreter_intStackSize; // L: 1413
			return 1; // L: 1414
		}
	}
}
