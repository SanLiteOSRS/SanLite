import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bv")
@Implements("RawPcmStream")
public class RawPcmStream extends PcmStream {
	@ObfuscatedName("f")
	int field469;
	@ObfuscatedName("e")
	int field457;
	@ObfuscatedName("v")
	int field458;
	@ObfuscatedName("y")
	int field459;
	@ObfuscatedName("j")
	int field460;
	@ObfuscatedName("o")
	int field461;
	@ObfuscatedName("m")
	int field456;
	@ObfuscatedName("r")
	@Export("numLoops")
	int numLoops;
	@ObfuscatedName("h")
	@Export("start")
	int start;
	@ObfuscatedName("d")
	@Export("end")
	int end;
	@ObfuscatedName("z")
	boolean field466;
	@ObfuscatedName("b")
	int field462;
	@ObfuscatedName("i")
	int field468;
	@ObfuscatedName("k")
	int field467;
	@ObfuscatedName("g")
	int field470;

	@ObfuscatedSignature(
		descriptor = "(Lar;III)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3, int var4) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field466 = var1.field380;
		this.field457 = var2;
		this.field458 = var3;
		this.field459 = var4;
		this.field469 = 0;
		this.method943();
	}

	@ObfuscatedSignature(
		descriptor = "(Lar;II)V"
	)
	RawPcmStream(RawSound var1, int var2, int var3) {
		super.sound = var1;
		this.start = var1.start;
		this.end = var1.end;
		this.field466 = var1.field380;
		this.field457 = var2;
		this.field458 = var3;
		this.field459 = 8192;
		this.field469 = 0;
		this.method943();
	}

	@ObfuscatedName("j")
	void method943() {
		this.field460 = this.field458;
		this.field461 = method1056(this.field458, this.field459);
		this.field456 = method1043(this.field458, this.field459);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("firstSubStream")
	protected PcmStream firstSubStream() {
		return null;
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(
		descriptor = "()Lbc;"
	)
	@Export("nextSubStream")
	protected PcmStream nextSubStream() {
		return null;
	}

	@ObfuscatedName("r")
	protected int vmethod4740() {
		return this.field458 == 0 && this.field462 == 0 ? 0 : 1;
	}

	@ObfuscatedName("h")
	@Export("fill")
	public synchronized void fill(int[] var1, int var2, int var3) {
		if (this.field458 == 0 && this.field462 == 0) {
			this.skip(var3);
		} else {
			RawSound var4 = (RawSound)super.sound;
			int var5 = this.start << 8;
			int var6 = this.end << 8;
			int var7 = var4.samples.length << 8;
			int var8 = var6 - var5;
			if (var8 <= 0) {
				this.numLoops = 0;
			}

			int var9 = var2;
			var3 += var2;
			if (this.field469 < 0) {
				if (this.field457 <= 0) {
					this.method945();
					this.remove();
					return;
				}

				this.field469 = 0;
			}

			if (this.field469 >= var7) {
				if (this.field457 >= 0) {
					this.method945();
					this.remove();
					return;
				}

				this.field469 = var7 - 1;
			}

			if (this.numLoops < 0) {
				if (this.field466) {
					if (this.field457 < 0) {
						var9 = this.method966(var1, var2, var5, var3, var4.samples[this.start]);
						if (this.field469 >= var5) {
							return;
						}

						this.field469 = var5 + var5 - 1 - this.field469;
						this.field457 = -this.field457;
					}

					while (true) {
						var9 = this.method1080(var1, var9, var6, var3, var4.samples[this.end - 1]);
						if (this.field469 < var6) {
							return;
						}

						this.field469 = var6 + var6 - 1 - this.field469;
						this.field457 = -this.field457;
						var9 = this.method966(var1, var9, var5, var3, var4.samples[this.start]);
						if (this.field469 >= var5) {
							return;
						}

						this.field469 = var5 + var5 - 1 - this.field469;
						this.field457 = -this.field457;
					}
				} else if (this.field457 < 0) {
					while (true) {
						var9 = this.method966(var1, var9, var5, var3, var4.samples[this.end - 1]);
						if (this.field469 >= var5) {
							return;
						}

						this.field469 = var6 - 1 - (var6 - 1 - this.field469) % var8;
					}
				} else {
					while (true) {
						var9 = this.method1080(var1, var9, var6, var3, var4.samples[this.start]);
						if (this.field469 < var6) {
							return;
						}

						this.field469 = var5 + (this.field469 - var5) % var8;
					}
				}
			} else {
				if (this.numLoops > 0) {
					if (this.field466) {
						label127: {
							if (this.field457 < 0) {
								var9 = this.method966(var1, var2, var5, var3, var4.samples[this.start]);
								if (this.field469 >= var5) {
									return;
								}

								this.field469 = var5 + var5 - 1 - this.field469;
								this.field457 = -this.field457;
								if (--this.numLoops == 0) {
									break label127;
								}
							}

							do {
								var9 = this.method1080(var1, var9, var6, var3, var4.samples[this.end - 1]);
								if (this.field469 < var6) {
									return;
								}

								this.field469 = var6 + var6 - 1 - this.field469;
								this.field457 = -this.field457;
								if (--this.numLoops == 0) {
									break;
								}

								var9 = this.method966(var1, var9, var5, var3, var4.samples[this.start]);
								if (this.field469 >= var5) {
									return;
								}

								this.field469 = var5 + var5 - 1 - this.field469;
								this.field457 = -this.field457;
							} while(--this.numLoops != 0);
						}
					} else {
						int var10;
						if (this.field457 < 0) {
							while (true) {
								var9 = this.method966(var1, var9, var5, var3, var4.samples[this.end - 1]);
								if (this.field469 >= var5) {
									return;
								}

								var10 = (var6 - 1 - this.field469) / var8;
								if (var10 >= this.numLoops) {
									this.field469 += var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field469 += var8 * var10;
								this.numLoops -= var10;
							}
						} else {
							while (true) {
								var9 = this.method1080(var1, var9, var6, var3, var4.samples[this.start]);
								if (this.field469 < var6) {
									return;
								}

								var10 = (this.field469 - var5) / var8;
								if (var10 >= this.numLoops) {
									this.field469 -= var8 * this.numLoops;
									this.numLoops = 0;
									break;
								}

								this.field469 -= var8 * var10;
								this.numLoops -= var10;
							}
						}
					}
				}

				if (this.field457 < 0) {
					this.method966(var1, var9, 0, var3, 0);
					if (this.field469 < 0) {
						this.field469 = -1;
						this.method945();
						this.remove();
					}
				} else {
					this.method1080(var1, var9, var7, var3, 0);
					if (this.field469 >= var7) {
						this.field469 = var7;
						this.method945();
						this.remove();
					}
				}

			}
		}
	}

	@ObfuscatedName("d")
	@Export("setNumLoops")
	public synchronized void setNumLoops(int var1) {
		this.numLoops = var1;
	}

	@ObfuscatedName("z")
	@Export("skip")
	public synchronized void skip(int var1) {
		if (this.field462 > 0) {
			if (var1 >= this.field462) {
				if (this.field458 == Integer.MIN_VALUE) {
					this.field458 = 0;
					this.field456 = 0;
					this.field461 = 0;
					this.field460 = 0;
					this.remove();
					var1 = this.field462;
				}

				this.field462 = 0;
				this.method943();
			} else {
				this.field460 += this.field468 * var1;
				this.field461 += this.field467 * var1;
				this.field456 += this.field470 * var1;
				this.field462 -= var1;
			}
		}

		RawSound var2 = (RawSound)super.sound;
		int var3 = this.start << 8;
		int var4 = this.end << 8;
		int var5 = var2.samples.length << 8;
		int var6 = var4 - var3;
		if (var6 <= 0) {
			this.numLoops = 0;
		}

		if (this.field469 < 0) {
			if (this.field457 <= 0) {
				this.method945();
				this.remove();
				return;
			}

			this.field469 = 0;
		}

		if (this.field469 >= var5) {
			if (this.field457 >= 0) {
				this.method945();
				this.remove();
				return;
			}

			this.field469 = var5 - 1;
		}

		this.field469 += this.field457 * var1;
		if (this.numLoops < 0) {
			if (!this.field466) {
				if (this.field457 < 0) {
					if (this.field469 >= var3) {
						return;
					}

					this.field469 = var4 - 1 - (var4 - 1 - this.field469) % var6;
				} else {
					if (this.field469 < var4) {
						return;
					}

					this.field469 = var3 + (this.field469 - var3) % var6;
				}

			} else {
				if (this.field457 < 0) {
					if (this.field469 >= var3) {
						return;
					}

					this.field469 = var3 + var3 - 1 - this.field469;
					this.field457 = -this.field457;
				}

				while (this.field469 >= var4) {
					this.field469 = var4 + var4 - 1 - this.field469;
					this.field457 = -this.field457;
					if (this.field469 >= var3) {
						return;
					}

					this.field469 = var3 + var3 - 1 - this.field469;
					this.field457 = -this.field457;
				}

			}
		} else {
			if (this.numLoops > 0) {
				if (this.field466) {
					label129: {
						if (this.field457 < 0) {
							if (this.field469 >= var3) {
								return;
							}

							this.field469 = var3 + var3 - 1 - this.field469;
							this.field457 = -this.field457;
							if (--this.numLoops == 0) {
								break label129;
							}
						}

						do {
							if (this.field469 < var4) {
								return;
							}

							this.field469 = var4 + var4 - 1 - this.field469;
							this.field457 = -this.field457;
							if (--this.numLoops == 0) {
								break;
							}

							if (this.field469 >= var3) {
								return;
							}

							this.field469 = var3 + var3 - 1 - this.field469;
							this.field457 = -this.field457;
						} while(--this.numLoops != 0);
					}
				} else {
					label161: {
						int var7;
						if (this.field457 < 0) {
							if (this.field469 >= var3) {
								return;
							}

							var7 = (var4 - 1 - this.field469) / var6;
							if (var7 >= this.numLoops) {
								this.field469 += var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field469 += var6 * var7;
							this.numLoops -= var7;
						} else {
							if (this.field469 < var4) {
								return;
							}

							var7 = (this.field469 - var3) / var6;
							if (var7 >= this.numLoops) {
								this.field469 -= var6 * this.numLoops;
								this.numLoops = 0;
								break label161;
							}

							this.field469 -= var6 * var7;
							this.numLoops -= var7;
						}

						return;
					}
				}
			}

			if (this.field457 < 0) {
				if (this.field469 < 0) {
					this.field469 = -1;
					this.method945();
					this.remove();
				}
			} else if (this.field469 >= var5) {
				this.field469 = var5;
				this.method945();
				this.remove();
			}

		}
	}

	@ObfuscatedName("b")
	public synchronized void method936(int var1) {
		this.method947(var1 << 6, this.method949());
	}

	@ObfuscatedName("i")
	synchronized void method1001(int var1) {
		this.method947(var1, this.method949());
	}

	@ObfuscatedName("k")
	synchronized void method947(int var1, int var2) {
		this.field458 = var1;
		this.field459 = var2;
		this.field462 = 0;
		this.method943();
	}

	@ObfuscatedName("g")
	public synchronized int method948() {
		return this.field458 == Integer.MIN_VALUE ? 0 : this.field458;
	}

	@ObfuscatedName("t")
	public synchronized int method949() {
		return this.field459 < 0 ? -1 : this.field459;
	}

	@ObfuscatedName("x")
	public synchronized void method950(int var1) {
		int var2 = ((RawSound)super.sound).samples.length << 8;
		if (var1 < -1) {
			var1 = -1;
		}

		if (var1 > var2) {
			var1 = var2;
		}

		this.field469 = var1;
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(Z)V",
		garbageValue = "1"
	)
	public synchronized void method941() {
		this.field457 = (this.field457 ^ this.field457 >> 31) + (this.field457 >>> 31);
		this.field457 = -this.field457;
	}

	@ObfuscatedName("q")
	void method945() {
		if (this.field462 != 0) {
			if (this.field458 == Integer.MIN_VALUE) {
				this.field458 = 0;
			}

			this.field462 = 0;
			this.method943();
		}

	}

	@ObfuscatedName("s")
	public synchronized void method953(int var1, int var2) {
		this.method954(var1, var2, this.method949());
	}

	@ObfuscatedName("p")
	public synchronized void method954(int var1, int var2, int var3) {
		if (var1 == 0) {
			this.method947(var2, var3);
		} else {
			int var4 = method1056(var2, var3);
			int var5 = method1043(var2, var3);
			if (var4 == this.field461 && var5 == this.field456) {
				this.field462 = 0;
			} else {
				int var6 = var2 - this.field460;
				if (this.field460 - var2 > var6) {
					var6 = this.field460 - var2;
				}

				if (var4 - this.field461 > var6) {
					var6 = var4 - this.field461;
				}

				if (this.field461 - var4 > var6) {
					var6 = this.field461 - var4;
				}

				if (var5 - this.field456 > var6) {
					var6 = var5 - this.field456;
				}

				if (this.field456 - var5 > var6) {
					var6 = this.field456 - var5;
				}

				if (var1 > var6) {
					var1 = var6;
				}

				this.field462 = var1;
				this.field458 = var2;
				this.field459 = var3;
				this.field468 = (var2 - this.field460) / var1;
				this.field467 = (var4 - this.field461) / var1;
				this.field470 = (var5 - this.field456) / var1;
			}
		}
	}

	@ObfuscatedName("c")
	public synchronized void method955(int var1) {
		if (var1 == 0) {
			this.method1001(0);
			this.remove();
		} else if (this.field461 == 0 && this.field456 == 0) {
			this.field462 = 0;
			this.field458 = 0;
			this.field460 = 0;
			this.remove();
		} else {
			int var2 = -this.field460;
			if (this.field460 > var2) {
				var2 = this.field460;
			}

			if (-this.field461 > var2) {
				var2 = -this.field461;
			}

			if (this.field461 > var2) {
				var2 = this.field461;
			}

			if (-this.field456 > var2) {
				var2 = -this.field456;
			}

			if (this.field456 > var2) {
				var2 = this.field456;
			}

			if (var1 > var2) {
				var1 = var2;
			}

			this.field462 = var1;
			this.field458 = Integer.MIN_VALUE;
			this.field468 = -this.field460 / var1;
			this.field467 = -this.field461 / var1;
			this.field470 = -this.field456 / var1;
		}
	}

	@ObfuscatedName("n")
	public synchronized void method1052(int var1) {
		if (this.field457 < 0) {
			this.field457 = -var1;
		} else {
			this.field457 = var1;
		}

	}

	@ObfuscatedName("l")
	public synchronized int method957() {
		return this.field457 < 0 ? -this.field457 : this.field457;
	}

	@ObfuscatedName("w")
	public boolean method1065() {
		return this.field469 < 0 || this.field469 >= ((RawSound)super.sound).samples.length << 8;
	}

	@ObfuscatedName("ae")
	public boolean method959() {
		return this.field462 != 0;
	}

	@ObfuscatedName("ac")
	int method1080(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field462 > 0) {
				int var6 = var2 + this.field462;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field462 += var2;
				if (this.field457 == 256 && (this.field469 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method977(0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, this.field467, this.field470, 0, var6, var3, this);
					} else {
						var2 = method976(((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, this.field468, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method981(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, this.field467, this.field470, 0, var6, var3, this, this.field457, var5);
				} else {
					var2 = method965(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, this.field468, 0, var6, var3, this, this.field457, var5);
				}

				this.field462 -= var2;
				if (this.field462 != 0) {
					return var2;
				}

				if (!this.method1057()) {
					continue;
				}

				return var4;
			}

			if (this.field457 == 256 && (this.field469 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method984(0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, 0, var4, var3, this);
				}

				return method968(((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method1006(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, 0, var4, var3, this, this.field457, var5);
			}

			return method972(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, 0, var4, var3, this, this.field457, var5);
		}
	}

	@ObfuscatedName("as")
	int method966(int[] var1, int var2, int var3, int var4, int var5) {
		while (true) {
			if (this.field462 > 0) {
				int var6 = var2 + this.field462;
				if (var6 > var4) {
					var6 = var4;
				}

				this.field462 += var2;
				if (this.field457 == -256 && (this.field469 & 255) == 0) {
					if (PcmPlayer.PcmPlayer_stereo) {
						var2 = method979(0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, this.field467, this.field470, 0, var6, var3, this);
					} else {
						var2 = method978(((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, this.field468, 0, var6, var3, this);
					}
				} else if (PcmPlayer.PcmPlayer_stereo) {
					var2 = method983(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, this.field467, this.field470, 0, var6, var3, this, this.field457, var5);
				} else {
					var2 = method982(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, this.field468, 0, var6, var3, this, this.field457, var5);
				}

				this.field462 -= var2;
				if (this.field462 != 0) {
					return var2;
				}

				if (!this.method1057()) {
					continue;
				}

				return var4;
			}

			if (this.field457 == -256 && (this.field469 & 255) == 0) {
				if (PcmPlayer.PcmPlayer_stereo) {
					return method971(0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, 0, var4, var3, this);
				}

				return method970(((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, 0, var4, var3, this);
			}

			if (PcmPlayer.PcmPlayer_stereo) {
				return method975(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field461, this.field456, 0, var4, var3, this, this.field457, var5);
			}

			return method974(0, 0, ((RawSound)super.sound).samples, var1, this.field469, var2, this.field460, 0, var4, var3, this, this.field457, var5);
		}
	}

	@ObfuscatedName("au")
	boolean method1057() {
		int var1 = this.field458;
		int var2;
		int var3;
		if (var1 == Integer.MIN_VALUE) {
			var3 = 0;
			var2 = 0;
			var1 = 0;
		} else {
			var2 = method1056(var1, this.field459);
			var3 = method1043(var1, this.field459);
		}

		if (var1 == this.field460 && var2 == this.field461 && var3 == this.field456) {
			if (this.field458 == Integer.MIN_VALUE) {
				this.field458 = 0;
				this.field456 = 0;
				this.field461 = 0;
				this.field460 = 0;
				this.remove();
				return true;
			} else {
				this.method943();
				return false;
			}
		} else {
			if (this.field460 < var1) {
				this.field468 = 1;
				this.field462 = var1 - this.field460;
			} else if (this.field460 > var1) {
				this.field468 = -1;
				this.field462 = this.field460 - var1;
			} else {
				this.field468 = 0;
			}

			if (this.field461 < var2) {
				this.field467 = 1;
				if (this.field462 == 0 || this.field462 > var2 - this.field461) {
					this.field462 = var2 - this.field461;
				}
			} else if (this.field461 > var2) {
				this.field467 = -1;
				if (this.field462 == 0 || this.field462 > this.field461 - var2) {
					this.field462 = this.field461 - var2;
				}
			} else {
				this.field467 = 0;
			}

			if (this.field456 < var3) {
				this.field470 = 1;
				if (this.field462 == 0 || this.field462 > var3 - this.field456) {
					this.field462 = var3 - this.field456;
				}
			} else if (this.field456 > var3) {
				this.field470 = -1;
				if (this.field462 == 0 || this.field462 > this.field456 - var3) {
					this.field462 = this.field456 - var3;
				}
			} else {
				this.field470 = 0;
			}

			return false;
		}
	}

	@ObfuscatedName("ay")
	int vmethod1099() {
		int var1 = this.field460 * 3 >> 6;
		var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
		if (this.numLoops == 0) {
			var1 -= var1 * this.field469 / (((RawSound)super.sound).samples.length << 8);
		} else if (this.numLoops >= 0) {
			var1 -= var1 * this.start / ((RawSound)super.sound).samples.length;
		}

		return var1 > 255 ? 255 : var1;
	}

	@ObfuscatedName("f")
	static int method1056(int var0, int var1) {
		return var1 < 0 ? var0 : (int)((double)var0 * Math.sqrt((double)(16384 - var1) * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("e")
	static int method1043(int var0, int var1) {
		return var1 < 0 ? -var0 : (int)((double)var0 * Math.sqrt((double)var1 * 1.220703125E-4D) + 0.5D);
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lar;II)Lbv;"
	)
	@Export("createRawPcmStream")
	public static RawPcmStream createRawPcmStream(RawSound var0, int var1, int var2) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, (int)((long)var0.sampleRate * 256L * (long)var1 / (long)(class341.field3921 * 100)), var2 << 6) : null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lar;III)Lbv;"
	)
	public static RawPcmStream method937(RawSound var0, int var1, int var2, int var3) {
		return var0.samples != null && var0.samples.length != 0 ? new RawPcmStream(var0, var1, var2, var3) : null;
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbv;)I"
	)
	static int method968(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var7 - var2) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2++] * var4) {
			var10001 = var3++;
		}

		var8.field469 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("aa")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbv;)I"
	)
	static int method984(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var4 + var9 - var3) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field469 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIILbv;)I"
	)
	static int method970(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, RawPcmStream var8) {
		var2 >>= 8;
		var7 >>= 8;
		var4 <<= 2;
		if ((var5 = var3 + var2 - (var7 - 1)) > var6) {
			var5 = var6;
		}

		int var10001;
		for (var5 -= 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var10001 = var3++;
		}

		for (var5 += 3; var3 < var5; var1[var10001] += var0[var2--] * var4) {
			var10001 = var3++;
		}

		var8.field469 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIILbv;)I"
	)
	static int method971(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10) {
		var3 >>= 8;
		var9 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		if ((var7 = var3 + var4 - (var9 - 1)) > var8) {
			var7 = var8;
		}

		var4 <<= 1;
		var7 <<= 1;

		int var10001;
		byte var11;
		for (var7 -= 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
			var2[var10001] += var11 * var6;
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		for (var7 += 6; var4 < var7; var2[var10001] += var11 * var6) {
			var11 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var11 * var5;
			var10001 = var4++;
		}

		var10.field469 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbv;II)I"
	)
	static int method972(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 257) / var11) > var8) {
			var7 = var8;
		}

		byte var13;
		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			var13 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1 + 1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4) - 1) / var11) > var8) {
			var7 = var8;
		}

		for (var1 = var12; var5 < var7; var4 += var11) {
			var13 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var1 - var13) * (var4 & 255)) * var6 >> 6;
		}

		var10.field469 = var4;
		return var5;
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method1006(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		byte var14;
		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var0 = (var14 << 8) + (var4 & 255) * (var2[var1 + 1] - var14);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var0 = (var14 << 8) + (var1 - var14) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field469 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIILbv;II)I"
	)
	static int method974(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, RawPcmStream var10, int var11, int var12) {
		if (var11 == 0 || (var7 = var5 + (var11 + (var9 + 256 - var4)) / var11) > var8) {
			var7 = var8;
		}

		int var10001;
		while (var5 < var7) {
			var1 = var4 >> 8;
			byte var13 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var13 << 8) + (var2[var1] - var13) * (var4 & 255)) * var6 >> 6;
			var4 += var11;
		}

		if (var11 == 0 || (var7 = var5 + (var11 + (var9 - var4)) / var11) > var8) {
			var7 = var8;
		}

		var0 = var12;

		for (var1 = var11; var5 < var7; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
		}

		var10.field469 = var4;
		return var5;
	}

	@ObfuscatedName("bq")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method975(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var5 <<= 1;

		int var10001;
		for (var8 <<= 1; var5 < var8; var4 += var12) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var0 = (var2[var1] - var14) * (var4 & 255) + (var14 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		if (var12 == 0 || (var8 = (var5 >> 1) + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var8 <<= 1;

		for (var1 = var13; var5 < var8; var4 += var12) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
		}

		var11.field469 = var4;
		return var5 >> 1;
	}

	@ObfuscatedName("bx")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbv;)I"
	)
	static int method976(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var8 - var2) > var7) {
			var6 = var7;
		}

		var9.field461 += var9.field467 * (var6 - var3);
		var9.field456 += var9.field470 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2++] * var4;
		}

		var9.field460 = var4 >> 2;
		var9.field469 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bi")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbv;)I"
	)
	static int method977(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var11 + var4 - var3) > var10) {
			var9 = var10;
		}

		var12.field460 += var12.field468 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3++];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field461 = var5 >> 2;
		var12.field456 = var6 >> 2;
		var12.field469 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "([B[IIIIIIIILbv;)I"
	)
	static int method978(byte[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, RawPcmStream var9) {
		var2 >>= 8;
		var8 >>= 8;
		var4 <<= 2;
		var5 <<= 2;
		if ((var6 = var3 + var2 - (var8 - 1)) > var7) {
			var6 = var7;
		}

		var9.field461 += var9.field467 * (var6 - var3);
		var9.field456 += var9.field470 * (var6 - var3);

		int var10001;
		for (var6 -= 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
			var4 += var5;
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		for (var6 += 3; var3 < var6; var4 += var5) {
			var10001 = var3++;
			var1[var10001] += var0[var2--] * var4;
		}

		var9.field460 = var4 >> 2;
		var9.field469 = var2 << 8;
		return var3;
	}

	@ObfuscatedName("bb")
	@ObfuscatedSignature(
		descriptor = "(I[B[IIIIIIIIIILbv;)I"
	)
	static int method979(int var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, RawPcmStream var12) {
		var3 >>= 8;
		var11 >>= 8;
		var5 <<= 2;
		var6 <<= 2;
		var7 <<= 2;
		var8 <<= 2;
		if ((var9 = var3 + var4 - (var11 - 1)) > var10) {
			var9 = var10;
		}

		var12.field460 += var12.field468 * (var9 - var4);
		var4 <<= 1;
		var9 <<= 1;

		byte var13;
		int var10001;
		for (var9 -= 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
			var6 += var8;
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		for (var9 += 6; var4 < var9; var6 += var8) {
			var13 = var1[var3--];
			var10001 = var4++;
			var2[var10001] += var13 * var5;
			var5 += var7;
			var10001 = var4++;
			var2[var10001] += var13 * var6;
		}

		var12.field461 = var5 >> 2;
		var12.field456 = var6 >> 2;
		var12.field469 = var3 << 8;
		return var4 >> 1;
	}

	@ObfuscatedName("bv")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method965(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field461 -= var11.field467 * var5;
		var11.field456 -= var11.field470 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 257) / var12) > var9) {
			var8 = var9;
		}

		byte var14;
		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			var14 = var2[var1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1 + 1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12 - 1) / var12) > var9) {
			var8 = var9;
		}

		for (var1 = var13; var5 < var8; var4 += var12) {
			var14 = var2[var4 >> 8];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var1 - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field461 += var11.field467 * var5;
		var11.field456 += var11.field470 * var5;
		var11.field460 = var6;
		var11.field469 = var4;
		return var5;
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbv;II)I"
	)
	static int method981(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field460 -= var5 * var13.field468;
		if (var14 == 0 || (var10 = var5 + (var12 - var4 + var14 - 257) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		byte var16;
		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			var16 = var2[var1];
			var0 = (var16 << 8) + (var4 & 255) * (var2[var1 + 1] - var16);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14 - 1) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var16 = var2[var4 >> 8];
			var0 = (var16 << 8) + (var1 - var16) * (var4 & 255);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field460 += var13.field468 * var5;
		var13.field461 = var6;
		var13.field456 = var7;
		var13.field469 = var4;
		return var5;
	}

	@ObfuscatedName("be")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIILbv;II)I"
	)
	static int method982(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, RawPcmStream var11, int var12, int var13) {
		var11.field461 -= var11.field467 * var5;
		var11.field456 -= var11.field470 * var5;
		if (var12 == 0 || (var8 = var5 + (var10 + 256 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		int var10001;
		while (var5 < var8) {
			var1 = var4 >> 8;
			byte var14 = var2[var1 - 1];
			var10001 = var5++;
			var3[var10001] += ((var14 << 8) + (var2[var1] - var14) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
			var4 += var12;
		}

		if (var12 == 0 || (var8 = var5 + (var10 - var4 + var12) / var12) > var9) {
			var8 = var9;
		}

		var0 = var13;

		for (var1 = var12; var5 < var8; var4 += var1) {
			var10001 = var5++;
			var3[var10001] += ((var0 << 8) + (var2[var4 >> 8] - var0) * (var4 & 255)) * var6 >> 6;
			var6 += var7;
		}

		var11.field461 += var11.field467 * var5;
		var11.field456 += var11.field470 * var5;
		var11.field460 = var6;
		var11.field469 = var4;
		return var5;
	}

	@ObfuscatedName("ba")
	@ObfuscatedSignature(
		descriptor = "(II[B[IIIIIIIIIILbv;II)I"
	)
	static int method983(int var0, int var1, byte[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, RawPcmStream var13, int var14, int var15) {
		var13.field460 -= var5 * var13.field468;
		if (var14 == 0 || (var10 = var5 + (var12 + 256 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var5 <<= 1;

		int var10001;
		for (var10 <<= 1; var5 < var10; var4 += var14) {
			var1 = var4 >> 8;
			byte var16 = var2[var1 - 1];
			var0 = (var2[var1] - var16) * (var4 & 255) + (var16 << 8);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		if (var14 == 0 || (var10 = (var5 >> 1) + (var12 - var4 + var14) / var14) > var11) {
			var10 = var11;
		}

		var10 <<= 1;

		for (var1 = var15; var5 < var10; var4 += var14) {
			var0 = (var1 << 8) + (var4 & 255) * (var2[var4 >> 8] - var1);
			var10001 = var5++;
			var3[var10001] += var0 * var6 >> 6;
			var6 += var8;
			var10001 = var5++;
			var3[var10001] += var0 * var7 >> 6;
			var7 += var9;
		}

		var5 >>= 1;
		var13.field460 += var13.field468 * var5;
		var13.field461 = var6;
		var13.field456 = var7;
		var13.field469 = var4;
		return var5;
	}
}
